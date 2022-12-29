package com.atguigu.mybatis.test;

/*
@author YG
@create 2022/12/29   17:55
*/

import com.atguigu.mybatis.mapper.SQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SQLMapperTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> users = mapper.getUserByLike("ad");
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int i = mapper.deleteMore("7,8,9");
        System.out.println(i);
    }

    @Test
    public void testgetUserByTable(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> t_user = mapper.getUserByTable("t_user");
        t_user.forEach(user -> System.out.println(user));
    }

    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "wangwu", "123456", 24, "男", "123@qq.com");
        System.out.println(user);
        mapper.insertUser(user);
        System.out.println(user);
    }
}
