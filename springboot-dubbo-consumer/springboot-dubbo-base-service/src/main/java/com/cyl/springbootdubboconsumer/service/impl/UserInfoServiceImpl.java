package com.cyl.springbootdubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.cyl.springbootdubboconsumer.service.UserInfoService;
import com.cyl.springbootdubboprovider.apiservice.UserInfoApi;
import com.cyl.springbootdubboprovider.vo.UserInfoVO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    @Reference
    private UserInfoApi userInfoApi;

    @Override
    public String getMsg() {
        return userInfoApi.message();
    }

    @Override
    public String getUserInfoOne() {
       /* UserInfoVO userInfo = userInfoApi.findOneUserInfo();
        log.info("getUserInfoOne:{}", userInfo);
        return JSON.toJSONString(userInfo);*/
        return userInfoApi.getFindOneUserInfo();
    }

    @Override
    public String getUserInfoAll() {
        return userInfoApi.getFindAllUserInfo();
    }

    @Override
    public UserInfoVO getUserInfo() {
        return userInfoApi.findOneUserInfo();
    }

    @Override
    public List<UserInfoVO> getUserInfos() {
        return userInfoApi.findAllUserInfo();
    }


}
