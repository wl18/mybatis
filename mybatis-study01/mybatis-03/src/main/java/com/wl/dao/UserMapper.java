package com.wl.dao;

import com.wl.pojo.User;

import java.util.List;

/**
 * @Author: weilong
 * @Date: 2020/5/22 11:15
 */
public interface UserMapper {

    //查询全部用户
    List<User> getUserList();

    //根据id查询
    User getUserById(int id);

    //增加一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUser(int id);
}
