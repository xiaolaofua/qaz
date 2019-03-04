package com.example.library.controller;

import com.example.library.domain.UserEntity;
import com.example.library.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserEntityController {
    @Autowired
    private UserEntityService userEntityService;

    @RequestMapping(value = "/denglu", method = RequestMethod.POST)
    @ResponseBody
    public String login(UserEntity userEntity) {
        userEntityService.login(userEntity);
        return "dengluchenggong";
    }


    @RequestMapping(value = "/denglu2", method = RequestMethod.POST)
    @ResponseBody
    public UserEntity login2(UserEntity userEntity) {
        UserEntity userEntity1 = userEntityService.login2(userEntity);
        if (userEntity1.getuMima()==userEntity.getuMima()){

        }

    }
}