package com.cyl.springbootdubboprovider.apiservice;

import com.cyl.springbootdubboprovider.vo.UserInfoVO;

import java.util.List;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
public interface UserInfoApi {

    String message();

    String getFindOneUserInfo();

    String getFindAllUserInfo();

    UserInfoVO findOneUserInfo();

    List<UserInfoVO> findAllUserInfo();
}
