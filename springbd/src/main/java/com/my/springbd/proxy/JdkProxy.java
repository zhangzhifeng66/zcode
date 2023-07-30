package com.my.springbd.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/24
 */
//必须实现Invocationhandler接口，完成代理类要做的功能（1.调用目标方法 2.完成目标增强）
public class JdkProxy implements InvocationHandler {

    // 源目标类
    private Object bean;

    //动态代理：目标对象是活动的，不是固定的，需要传入进来
    //传入的是谁，就给谁创建代理
    public JdkProxy(Object bean) {
        this.bean = bean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // ===完成目标增强 start ===
        String methodName = method.getName();
        if (methodName.equals("wakeup")){
            System.out.println("早安~~~");
        }else if(methodName.equals("sleep")){
            System.out.println("晚安~~~");
        }
        // ===完成目标增强 end ===

        // 调用目标方法
        return method.invoke(bean, args);
    }
}
