package com.atguigu.dao;

import com.atguigu.pojo.User;


public interface UserDao {
    /**
     * 根据用户名查询信息
     */
    public User queryUserByUsername(String Username);
    public User queryUserByUsernameAndPassword(String Username,String Password);
    /**
     * 保存用户
     */
    public int saveUser(User user);
}
