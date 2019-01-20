package com.dietcontroller.dietcontrollerweb.dao;

import com.dietcontroller.dietcontrollerweb.model.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}