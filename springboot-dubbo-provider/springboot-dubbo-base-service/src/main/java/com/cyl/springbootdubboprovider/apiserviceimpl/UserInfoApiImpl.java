package com.cyl.springbootdubboprovider.apiserviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.cyl.springbootdubboprovider.apiservice.UserInfoApi;
import com.cyl.springbootdubboprovider.vo.UserInfoVO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
@Service(interfaceClass = UserInfoApi.class)
public class UserInfoApiImpl implements UserInfoApi {

    @Override
    public String message() {
        return "UserInfoApiImpl<<==>>springbootDubboProvider";
    }

    @Override
    public String getFindOneUserInfo() {
        return JSON.toJSONString(findOneUserInfo());
    }

    @Override
    public String getFindAllUserInfo() {
        return JSON.toJSONString(findAllUserInfo());
    }

    @Override
    public UserInfoVO findOneUserInfo() {
        UserInfoVO userInfoVO = getUserInfoVO();
        return userInfoVO;
    }



    @Override
    public List<UserInfoVO> findAllUserInfo() {
        List<UserInfoVO> userInfoVOList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            UserInfoVO userInfoVO = getUserInfoVO();
            userInfoVOList.add(userInfoVO);
        }

        return userInfoVOList;
    }


    private UserInfoVO getUserInfoVO() {
        UserInfoVO userInfoVO = new UserInfoVO();
        int age = (int) (Math.random() * 40);
        userInfoVO.setAge( age );
        userInfoVO.setUserName("cyl" + age);
        userInfoVO.setSex("female");
        return userInfoVO;
    }
}
