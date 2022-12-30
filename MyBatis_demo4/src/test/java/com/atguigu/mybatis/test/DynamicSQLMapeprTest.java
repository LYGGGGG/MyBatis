package com.atguigu.mybatis.test;

/*
@author YG
@create 2022/12/30   15:45
*/

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class DynamicSQLMapeprTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);

    }
}
