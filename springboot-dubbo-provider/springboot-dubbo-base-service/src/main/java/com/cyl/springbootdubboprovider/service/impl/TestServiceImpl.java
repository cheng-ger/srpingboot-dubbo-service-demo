package com.cyl.springbootdubboprovider.service.impl;

import com.cyl.springbootdubboprovider.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author chengyuanliang
 * @desc
 * @since 2019-07-28
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHi() {
        return "HI";
    }
}
