package com.wl.dao;

import com.wl.dao.UserMapper;
import com.wl.pojo.User;
import com.wl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: weilong
 * @Date: 2020/5/22 14:18
 */
public class UserDaoTest {
    @Test
    public void test1(){
        //第一步：获得SqlSession对对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句

        //方式一：getMapper 官网推荐
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        //方式二：
//        List<User> userList = sqlSession.selectList("com.wl.dao.UserDao.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession
        sqlSession.close();

    }
}
