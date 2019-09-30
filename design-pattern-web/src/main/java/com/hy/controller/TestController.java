package com.hy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghai on 2018/9/6.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        return "test1 run!";
    }


    @RequestMapping("/test2")
    @ResponseBody
    public String test2() {
        return "test2 run!";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public String test3() {
        return "test3 run!";
    }

}
