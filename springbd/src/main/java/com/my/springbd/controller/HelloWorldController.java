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
@Controller
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping(value="index.do", method = RequestMethod.GET)
    @ResponseBody
    public String index() {
        System.out.println("1111");
        return "Hello World88";
    }

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi() {
        return "hello world!";
    }

}
