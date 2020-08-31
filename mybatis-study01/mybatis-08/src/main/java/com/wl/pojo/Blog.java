package com.wl.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: weilong
 * @Date: 2020/6/9 21:06
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;//属性名和字段名不一致
    private int views;
}
