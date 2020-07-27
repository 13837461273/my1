package com.atguigu.test;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceTest {
    UserService userservice=new UserServiceImpl();
    @Test
    public void registUser() {
        userservice.registUser(new User(null,"abc","123","abc@qq.com"));
    }

    @Test
    public void login() {
        System.out.println(userservice.login(new User(null,"abc","123","null")));
    }

    @Test
    public void existsUsername() {
        if(userservice.existsUsername("abcd")){
            System.out.println("用户存在");
        }else{
            System.out.println("用户不存在");
        }

    }
}