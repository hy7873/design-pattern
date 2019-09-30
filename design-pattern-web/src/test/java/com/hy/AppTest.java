package com.hy;

import com.hy.dao.UserMapper;
import com.hy.design_pattern.strategy.ActivityServiceProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ActivityServiceProcessor icbcETCActivityService;


    @Test
    public void test1() {
        /*List<User> userList = new ArrayList<>();
        User user = new User();
        user.setMobile("158");
        userList = userMapper.getListByConditionLike(user);
        System.out.println(new Gson().toJson(userList));*/
    }

    @Test
    public void test2() {
        icbcETCActivityService.process("ccbVolunteer");
    }
}
