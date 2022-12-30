package com.atguigu.mybatis.mapper;

/*
@author YG
@create 2022/12/29   21:40
*/

import com.atguigu.mybatis.pojo.Dept;
import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    /**
     * 查询所有的员工信息
     */
    List<Emp> getAllEmp();

    /**
     * 查询员工以及员工所对应的部门信息
     */
    Emp getEmpAndDept(@Param("eid") Integer eid);

    /**
     * 通过分步查询，查询员工以及员工所对应的部门信息
     * 第一步：查询员工信息
     */
    Emp getEmpAndDeptByStep1(@Param("eid")Integer eid);

    /**
     * 通过分步查询，查询部门以及部门中所有的员工信息
     * 第二步：根据did查询员工信息
     */
    List<Emp> getDeptAndEmpByStep2(@Param("did") Integer did);
}
