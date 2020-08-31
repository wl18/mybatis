package com.wl.pojo;

import lombok.Data;

/**
 * @Author: weilong
 * @Date: 2020/6/9 10:51
 */
@Data
public class Student {
    private int id;
    private String name;

    //学生需要关联一个老师
    private Teacher teacher;
}
