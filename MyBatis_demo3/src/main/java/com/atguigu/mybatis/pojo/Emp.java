package com.atguigu.mybatis.pojo;

/*
@author YG
@create 2022/12/29   21:36
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private Integer eid;
    private String empName;
    private Integer age;
    private String sex;
    private String email;

}
