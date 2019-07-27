package com.cyl.springbootdubboprovider.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-27
 */
@Data
public class UserInfoVO implements Serializable {

    private static final long serialVersionUID = -1409918725225996717L;
    private String userName;

    private String sex;

    private Integer age;

    private String hobby;
}
