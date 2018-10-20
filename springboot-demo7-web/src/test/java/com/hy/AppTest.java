package com.hy;

import com.google.gson.Gson;
import com.hy.dao.UserMapper;
import com.hy.model.User;
import com.hy.service.UserStatusService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setMobile("158");
        userList = userMapper.getListByConditionLike(user);
        System.out.println(new Gson().toJson(userList));
    }
}
