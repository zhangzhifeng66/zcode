package com.my.springbd.proxy;

import java.lang.reflect.Proxy;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/24
 */
public class PersonProxyTest {
    public static void main(String[] args) {
//        Person student = new Student("张三");
//        PersonProxy studentProxy = new PersonProxy(student);
//        studentProxy.wakeup();
//        studentProxy.sleep();

        // 1.创建目标对象
//        Person student = new Student("张三");
        // 2.创建Invocationhandler对象
        JdkProxy proxy = new JdkProxy(new Student("张三"));
        // 3.创建（实例化）代理对象赋值给接口Person
        Person student = (Person) Proxy.newProxyInstance(proxy.getClass().getClassLoader(), new Class[]{Person.class}, proxy);
        // 4.通过动态生成的代理对象去执行增强代码逻辑和执行源目标类Student的wakeup、sleep方法逻辑
        student.wakeup();
        student.sleep();
//        System.out.println("111111111111");

    }
}
