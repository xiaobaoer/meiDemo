package gaoshuai.service;
import gaoshuai.mapper.UserMapper;
import gaoshuai.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gaoshuai.dao.UserDao;


/**
 * Created by gaoshuai on 2017/7/2.
 */
//自动添加到spring容器中
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper){
        this.userMapper=userMapper;
    }

//    @Override
    public int insertUser(User user){
        return userMapper.insertUser(user);
    }


}
