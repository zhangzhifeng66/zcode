package com.my.springbd.proxy;

import org.springframework.util.StringUtils;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/24
 */
public class Student implements Person{

    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void wakeup() {
        String str = "学生[" + name +"]早晨醒来啦";
        System.out.println(str);
    }

    @Override
    public void sleep() {
        String str = "学生[" + name + "]晚上睡觉啦";
        System.out.println(str);
    }
}

