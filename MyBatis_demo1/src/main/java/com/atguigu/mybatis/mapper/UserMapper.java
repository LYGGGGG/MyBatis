package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/27   22:16
*/

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    int updateUser();

    int deleteUser();

    User queryUserById();

    List<User> queryAllUser();
}
