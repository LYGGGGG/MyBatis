package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/28   20:58
*/

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface ParameterMapper {
    /**
     * 查询所有
     */
    List<User> getAllUser();
}
