package com.dietcontroller.dietcontrollerweb.dao;

import com.dietcontroller.dietcontrollerweb.model.Food;

public interface FoodMapper {
    int insert(Food record);

    int insertSelective(Food record);
}