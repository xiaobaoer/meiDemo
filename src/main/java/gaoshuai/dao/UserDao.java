package gaoshuai.dao;
import gaoshuai.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by gaoshuai on 2017/6/29.
 */
public interface UserDao {
    //根据ID查询用户信息
//     User findUserById(int id);
    //添加用户信息
     User insertUser(User user);
    //删除用户信息
//     User deleteUser(int id);
    //更新用户信息
//     void updateUser(User user) throws Exception;
    //根据用户名模糊查找
//    public List<User> findUserByName(String user) throws Exception;
}