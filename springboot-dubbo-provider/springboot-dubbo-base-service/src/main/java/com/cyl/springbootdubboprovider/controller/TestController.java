package com.cyl.springbootdubboprovider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
@RestController
@RequestMapping("testService")
public class TestController {

    @RequestMapping("hello")
    public String hello() {

        return "HELLO-WORLD!";
    }
}
