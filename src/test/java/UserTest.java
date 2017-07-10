import gaoshuai.dao.UserDao;
import gaoshuai.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by gaoshuai on 2017/6/29.
 */

public class UserTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        //创建sqlSessionFactory
        //MyBatis配置文件
        String resource = "MyBatisCfg.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入MyBatis的配置信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    }
    @Test
    public void testFindUserById() throws Exception{
        //获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建UserMapper对象，MyBatis自动生成mapper代理
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        //调用userMapper的方法
//        User user = userDao.findUserById(1);
        //关闭资源
        sqlSession.close();
        //打印客户信息
//        System.out.println(user);
    }
}