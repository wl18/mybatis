package com.wl.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: weilong
 * @Date: 2020/6/10 15:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {  //实现接口，序列化实体类
    private int id;
    private String name;
    private String pwd;
}
