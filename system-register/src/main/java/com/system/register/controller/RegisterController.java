package com.system.register.controller;

import com.system.register.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RegisterController {
    @Autowired
    RegisterService loginService;


}
