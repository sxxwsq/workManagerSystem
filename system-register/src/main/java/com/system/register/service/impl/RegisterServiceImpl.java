package com.system.register.service.impl;

import com.system.login.mapper.LoginMapper;
import com.system.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements LoginService {

    @Autowired
    LoginMapper loginMapper;

}
