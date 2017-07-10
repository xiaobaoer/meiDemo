package gaoshuai.dao.Imp;

import gaoshuai.dao.UserDao;
import gaoshuai.dto.UserDto;
import gaoshuai.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import gaoshuai.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by gaoshuai on 2017/6/29.
 */
//@Repository("userDao")
public class UserDaoImpl implements UserDao {
//
//    // 需要向dao实现类中注入SqlSessionFactory
//    // 这里通过构造方法注入
//    private SqlSessionFactory sqlSessionFactory;
//
//    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
//        super();
//        this.sqlSessionFactory = sqlSessionFactory;
//    }
//
//    public User deleteUser(int id) throws Exception {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //执行删除操作
//        User user=sqlSession.selectOne("deleteUser",id);
////        sqlSession.insert("deleteUser", id);
//        // 提交事务
////        sqlSession.commit();
//        // 释放资源
//        sqlSession.close();
//        return user;
//    }
//
//    public User findUserById(int id) throws Exception {
//        SqlSession sqlSession = sqlSessionFactory.openSession();//获取sqlSession
//        User user = sqlSession.selectOne("findUserById", id);
//        sqlSession.close();//关闭资源
//        return user;
//    }
////  z  @Override
//    public User insertUser(User user) throws Exception {
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //执行插入操作
//        sqlSession.insert("insertUser", user);
//        // 提交事务
//        sqlSession.commit();
//        // 释放资源
//        sqlSession.close();
//        return user;
//    }
//    public User updateUser(User user) throws Exception{
//        SqlSession sqlSession=sqlSessionFactory.openSession();
//        sqlSession.selectOne("updateUser",user);
//
//    }
    @Autowired
    private UserMapper userMapper;

    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }

}