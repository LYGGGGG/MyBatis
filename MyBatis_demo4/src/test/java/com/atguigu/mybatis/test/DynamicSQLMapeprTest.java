package com.atguigu.mybatis.test;

/*
@author YG
@create 2022/12/30   15:45
*/

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicSQLMapeprTest {
    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition3(new Emp(null, null, 23, null, "123@qq.com", null));
        empByCondition.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = mapper.getEmpByChoose(new Emp(null, null, null, null, null, null));
        emps.forEach(emp -> System.out.println(emp));
    }

    @Test
    public void testDeleteMoreByArray() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        int i = mapper.deleteMoreByArray(new Integer[]{7, 9, 11});
        System.out.println(i);
    }

    @Test
    public void testInsertMoreByList() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "a1", 23, "男", "123@qq.com", null);
        Emp emp2 = new Emp(null, "a2", 23, "男", "123@qq.com", null);
        Emp emp3 = new Emp(null, "a3", 23, "男", "123@qq.com", null);
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        int i = mapper.insertMoreByList(list);
        System.out.println(i);
    }
}
