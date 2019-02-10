package com.dietcontroller.dietcontrollerweb.dao;

import com.dietcontroller.dietcontrollerweb.model.User;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    @Select({
            "select",
            "* ",
            "from user",
            "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    User selectByPrimaryKey(Integer userId);

    @Select({
            "select",
            "* ",
            "from user",
            "where user_name = #{userName,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    User selectByUserName(String userName);
}