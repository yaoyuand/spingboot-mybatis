package com.mybatis.service.impl;

import com.mybatis.model.User;
import com.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void show() throws Exception {
        List<User> list=userService.show();
        System.out.println(list.size());
    }

    @Test
    public void findById() throws Exception {
        User user=userService.findById(1);
        System.out.println(user.getAddress()+" "+user.getName());
    }

    @Test
    public void insert() throws Exception {
        User user=new User();
        user.setAddress("南京");
        user.setCity("南京");
        user.setName("张三11");
        userService.insert(user);
    }

    @Test
    public void delete() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

}