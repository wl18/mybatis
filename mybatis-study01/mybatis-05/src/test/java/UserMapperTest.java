import com.wl.dao.UserMapper;
import com.wl.pojo.User;
import com.wl.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author: weilong
 * @Date: 2020/6/8 21:50
 */
public class UserMapperTest {


    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //因为设置了true，这里不用手动提交事务
//        mapper.updateUser(new User(5,"to","22233"));

        mapper.deleteUser(7);

        sqlSession.close();
    }
       /*
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

        User user = mapper.getUserById(1);
        System.out.println(user);

         */
}
