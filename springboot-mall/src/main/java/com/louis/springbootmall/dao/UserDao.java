package com.louis.springbootmall.dao;

import com.louis.springbootmall.dto.UserRegisterRequest;
import com.louis.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
