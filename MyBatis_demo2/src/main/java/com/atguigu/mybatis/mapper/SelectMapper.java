package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/29   14:08
*/

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SelectMapper {
    /**
     * 根据id查询用户
     */
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户
     */
    List<User> getAllUsers();
}
