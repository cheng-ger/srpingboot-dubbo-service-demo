package com.cyl.springbootdubboconsumer.service;


import com.cyl.springbootdubboprovider.vo.UserInfoVO;

import java.util.List;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
public interface UserInfoService {

    String getMsg();

    String getUserInfoOne();

    String getUserInfoAll();



    UserInfoVO getUserInfo();

    List<UserInfoVO> getUserInfos();
}
