package com.wl.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author: weilong
 * @Date: 2020/6/9 10:52
 */
@Data
public class Teacher {
    private int id;
    private String name;

    //一个老师拥有多个学生
    private List<Student> students;
}
