package com.louis.springbootmall.service;

import com.louis.springbootmall.dto.UserLoginRequest;
import com.louis.springbootmall.dto.UserRegisterRequest;
import com.louis.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
