package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/28   20:58
*/

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    /**
     * 查询所有
     */
    List<User> getAllUser();

    /**
     * 根据用户名查询用户
     */
    User getUserByUsername(String username);

    /**
     * 登录验证
     */
    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    /**
     * 验证登录 使用@Param
     */
    User checkLoginByParam(@Param("username") String username,@Param("password") String password);

    /**
     * 添加用户
     */
    int insertUser(User user);
}
