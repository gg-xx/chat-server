package com.xcu.service;

import com.xcu.entity.TbUser;
import com.xcu.entity.TbUserExample;
import com.xcu.entity.vo.User;
import com.xcu.mapper.TbUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Autowired
    private UserService userService;

    @Test
    public void register() {
        TbUser user = new TbUser();
        user.setUsername("admin");
        user.setPassword("123456");
        userService.register(user);
    }

    @Test
    public void login() {
        User admin = userService.login("admin", "123456");
        System.out.println(admin);
    }
}
