package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/30   15:38
*/

import com.atguigu.mybatis.pojo.Emp;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     * 不确定结果是几条数据，采用List
     */
    List<Emp> getEmpByCondition(Emp emp);

}
