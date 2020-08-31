import com.wl.dao.UserMapper;
import com.wl.pojo.User;
import com.wl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Author: weilong
 * @Date: 2020/6/10 15:39
 */
public class MyTest {
    @Test
    public void test(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserById(1);
        System.out.println(user);
        sqlSession.close();

        User user2 = mapper2.queryUserById(1);
        System.out.println(user2);

        System.out.println(user==user2);

        sqlSession2.close();
    }
}
