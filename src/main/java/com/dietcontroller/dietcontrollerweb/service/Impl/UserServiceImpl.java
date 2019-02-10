package com.dietcontroller.dietcontrollerweb.service.Impl;

import com.dietcontroller.dietcontrollerweb.dao.UserMapper;
import com.dietcontroller.dietcontrollerweb.model.User;
import com.dietcontroller.dietcontrollerweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int login(String userName, String password) {
        int result = 0;
        User user = userMapper.selectByUserName(userName);
        if (user == null) {
            return -1;
        } else if (!user.getUser_password().equals(password)) {
            return 0;
        }
        return user.getUser_id();
    }
}
