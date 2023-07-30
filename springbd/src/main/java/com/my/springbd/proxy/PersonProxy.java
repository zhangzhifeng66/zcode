package com.my.springbd.proxy;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/24
 */
public class PersonProxy implements Person {

    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void wakeup() {
        System.out.println("早安~");
        person.wakeup();
    }

    @Override
    public void sleep() {
        System.out.println("晚安~");
        person.sleep();
    }
}

