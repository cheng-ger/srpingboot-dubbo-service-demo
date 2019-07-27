package com.cyl.springbootdubboconsumer.controller;

import com.cyl.springbootdubboconsumer.service.UserInfoService;
import com.cyl.springbootdubboprovider.vo.UserInfoVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
@Slf4j
@RestController
@RequestMapping("TestDubboConsumerService")
public class TestDubboController {

    @Autowired
    private UserInfoService serInfoService;

    @RequestMapping("test")
    public String test(){
        //log.info("TestDubboConsumerService/test1");
        return "TestDubboConsumerService/test";
    }

    @RequestMapping("test1")
    public String getMsg(){
        log.info("TestDubboConsumerService/test1");
        return serInfoService.getMsg();
    }
    @RequestMapping("test2")
    public String getUserInfoOne(){
        log.info("TestDubboConsumerService/test2");
        return serInfoService.getUserInfoOne();
    }

    @RequestMapping("test3")
    public String getUserInfoAll(){
        log.info("TestDubboConsumerService/test3");
        return serInfoService.getUserInfoAll();
    }

    @RequestMapping("test4")
    public UserInfoVO getUserInfo() {
        log.info("TestDubboConsumerService/test4");
        return serInfoService.getUserInfo();
    }
    @RequestMapping("test5")
    public List<UserInfoVO> getUserInfos() {
        log.info("TestDubboConsumerService/test5");
        return serInfoService.getUserInfos();
    }


}
