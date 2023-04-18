package com.louis.springbootmall.service.impl;

import com.louis.springbootmall.dao.UserDao;
import com.louis.springbootmall.dto.UserRegisterRequest;
import com.louis.springbootmall.model.User;
import com.louis.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
