package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/29   21:40
*/

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {

    /**
     * 通过分步查询，查询员工以及员工所对应的部门信息
     * 第二步：通过did查询员工所对应的部门
     */
    Dept getEmpAndDeptByStep2(@Param("did") Integer did);

    /**
     * 获取部门以及部门中所有员工的信息
     */
    Dept getDeptAndEmp(@Param("did") Integer did);

    /**
     * 通过分步查询，获取部门以及部门中所有员工的信息
     * 分步查询第一步：查询部门信息
     */
    Dept getDeptAndEmpByStep1(@Param("did") Integer did);
}
