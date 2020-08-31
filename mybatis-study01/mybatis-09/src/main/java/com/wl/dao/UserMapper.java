package com.wl.dao;

import com.wl.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: weilong
 * @Date: 2020/6/10 15:10
 */
public interface UserMapper {

    //根据id查询用户
    User queryUserById(@Param("id") int id);

    void updateUser(User user);
}
