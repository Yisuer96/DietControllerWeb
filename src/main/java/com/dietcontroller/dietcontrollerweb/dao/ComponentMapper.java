package com.dietcontroller.dietcontrollerweb.dao;

import com.dietcontroller.dietcontrollerweb.model.Component;

public interface ComponentMapper {
    int insert(Component record);

    int insertSelective(Component record);
}