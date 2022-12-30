package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/30   15:38
*/

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 多条件查询
     * 不确定结果是几条数据，采用List
     */
    List<Emp> getEmpByCondition1(Emp emp);

    List<Emp> getEmpByCondition2(Emp emp);

    List<Emp> getEmpByCondition3(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 通过数组实现批量删除
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 通过list集合实现批量添加
     */
    int insertMoreByList(@Param("emps") List<Emp> emps);
}
