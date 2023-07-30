package com.my.springbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author zzf
 * @since 2023/7/22
 */
@RestController
@RequestMapping("/rt")
public class RestTestController {

    @RequestMapping(value="test.do", method = RequestMethod.GET)
    public String index() {
        System.out.println("1111");
        return "test";
    }

    @RequestMapping(value = "/say22", method = RequestMethod.GET)
    public String sayHi() {
        return "hello world!";
    }

}
