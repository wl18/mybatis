package com.wl.dao;

import com.wl.pojo.Student;

import java.util.List;

/**
 * @Author: weilong
 * @Date: 2020/6/9 10:54
 */
public interface StudentMapper {

    //查询所有学生信息，以及对应老师的信息
    public List<Student> getStudent();

    public List<Student> getStudent2();

}
