package com.atguigu.mybatis.test;

/*
@author YG
@create 2022/12/29   14:14
*/

import com.atguigu.mybatis.mapper.SelectMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SelectMapperTest {
    @Test
    public void testGetUserById(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> userById = mapper.getUserById(7);
        userById.forEach(user -> System.out.println(user));
    }

    @Test
    public void testGetAllUsers(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        allUsers.forEach(user -> System.out.println(user));
    }
}
