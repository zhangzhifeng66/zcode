package com.my.springbd.proxy;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/24
 */
public class CglibProxyTest {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy(new Student("张三"));
        // 动态代理对象赋值给了子类
        Student student = (Student) proxy.getProxy();
        student.wakeup();
        student.sleep();

    }
}
