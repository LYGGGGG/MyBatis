package com.atguigu.mybatis.pojo;

/*
@author YG
@create 2022/12/29   21:39
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    private Integer did;
    private String deptName;
}
