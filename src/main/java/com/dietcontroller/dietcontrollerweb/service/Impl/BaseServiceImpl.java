package com.dietcontroller.dietcontrollerweb.service.Impl;

import com.dietcontroller.dietcontrollerweb.dao.UserMapper;
import com.dietcontroller.dietcontrollerweb.model.User;
import com.dietcontroller.dietcontrollerweb.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseServiceImpl implements IBaseService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getCurrentUser(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

}
