package com.atguigu.service;

import com.atguigu.pojo.User;

public interface UserService {
    /**
     * 注册
     */
    public void registUser(User user);
    /**
     * 登录
     */
    public User login(User user);
    /**
     * 检查是否可用
     */
    public boolean existsUsername(String username);
}
