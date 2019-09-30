package com.hy.controller;

import com.hy.dao.AdUserMapper;
import com.hy.model.AdUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AdUserMapper adUserMapper;

    @RequestMapping("addUser")
    @ResponseBody
    public String addUser() {
        AdUser adUser = new AdUser();
        adUser.setTelephone("12121112");
        adUser.setCardNumber("ccddaa");
        adUser.setGroupNum(12L);
        adUser.setPassword("xxass");
        adUser.setCreateDate(LocalDateTime.now());
        adUser.setUpdateDate(LocalDateTime.now());
        adUserMapper.insertAdUser(adUser);
        return "SUCCESS";
    }

}
