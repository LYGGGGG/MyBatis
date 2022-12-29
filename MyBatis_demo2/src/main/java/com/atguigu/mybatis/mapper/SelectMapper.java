package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/29   14:08
*/

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 根据id查询用户
     */
    List<User> getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户
     */
    List<User> getAllUsers();

    /**
     * 查询用户的总记录数
     */
    Integer getCount();

    /**
     * 根据用户id查询用户信息为map集合
     */
    Map<String, Object> getUserToMap(@Param("id") Integer id);

    /**
     * 查询所有用户信息为map集合
     */
    List<Map<String, Object>> getAllUsersToMap();

    /**
     * 查询所有用户信息为map集合2
     */
    @MapKey("id")
    Map<String,Object> getAllUsersToMap2();
}
