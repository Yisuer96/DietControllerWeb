package com.dietcontroller.dietcontrollerweb.service;


public interface IUserService extends IBaseService {
    int login(String userName, String password);
}
