package com.my.springbd.proxy;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/24
 */
public class CglibProxy implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    private Object bean;

    public CglibProxy(Object bean) {
        this.bean = bean;
    }

    // enhancer根据字节码创建一个原bean,创建完毕之后会调用intercept方法,传入这个obj
    public Object getProxy() {
        //设置需要创建子类的类
        enhancer.setSuperclass(bean.getClass());
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    //实现MethodInterceptor接口方法 这个obj来自于getProxy()
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        String methodName = method.getName();
        if (methodName.equals("wakeup")) {
            System.out.println("早安~~~");
        } else if (methodName.equals("sleep")) {
            System.out.println("晚安~~~");
        }

        //调用原bean的方法
        return method.invoke(bean, args);
    }
}

