package dao;

import com.wl.dao.UserMapper;
import com.wl.pojo.User;
import com.wl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: weilong
 * @Date: 2020/5/22 14:18
 */
public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获得SqlSession对对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql语句

        //方式一：getMapper 官网推荐
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(1);
        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();

    }
}
