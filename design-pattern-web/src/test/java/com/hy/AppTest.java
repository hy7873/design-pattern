package com.hy;

import com.hy.dao.AdGroupDirIntegralMapper;
import com.hy.dao.OrderMapper;
import com.hy.dao.UserMapper;
import com.hy.dao.base.OrderBaseMapper;
import com.hy.design_pattern.strategy.ActivityServiceProcessor;
import com.hy.model.AdGroupDirIntegral;
import com.hy.model.Order;
import io.netty.resolver.AddressResolverGroup;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ActivityServiceProcessor icbcETCActivityService;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private AdGroupDirIntegralMapper adGroupDirIntegralMapper;


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

    @Test
    public void test3() {
        /*Order order = new Order();
        order.setOrderNumber("xxx-xxx-11-122");
        order.setAmount(new BigDecimal("100"));
        int i = orderMapper.insertOrder(order);
        System.out.println("i = " + i);*/

        AdGroupDirIntegral adGroupDirIntegral = new AdGroupDirIntegral();
        adGroupDirIntegral.setAdGroupId(12121L);
        adGroupDirIntegral.setAvailIntegral(BigDecimal.ZERO);
        adGroupDirIntegral.setBatchNo("ccddff");
        adGroupDirIntegral.setGroupName("xxx");
        adGroupDirIntegral.setIntegralName("xxx");
        adGroupDirIntegral.setBeginDate(LocalDateTime.now());
        adGroupDirIntegral.setEndDate(LocalDateTime.now());
        adGroupDirIntegral.setCreateBy("sys");
        adGroupDirIntegral.setCreateDate(LocalDateTime.now());
        adGroupDirIntegral.setUpdateBy("sys");
        adGroupDirIntegral.setUpdateDate(LocalDateTime.now());
        int i = adGroupDirIntegralMapper.insertAdGroupDirIntegral(adGroupDirIntegral);
        System.out.println("i = " + i);
    }
}
