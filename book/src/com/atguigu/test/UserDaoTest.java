package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();
    @Test
    public void queryUserByUsername() {

        System.out.println(userDao.queryUserByUsername("admin"));
        if(userDao.queryUserByUsername("admin")==null){
            System.out.println("用户名可用");
        }   else{
            System.out.println("用户名已存在");
        }
    }

    @Test
    public void queryUserByUsernameAndPassword() {
    if(userDao.queryUserByUsernameAndPassword("admin","admin")==null){
        System.out.println();
    }else {
        System.out.println();
    }
    }

    @Test
    public void saveUser() {
        int admin = userDao.saveUser(new User(null, "admin", "123456", "admin@qq.com"));
        System.out.println(admin);
    }
}