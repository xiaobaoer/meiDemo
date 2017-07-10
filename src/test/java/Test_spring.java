import gaoshuai.pojo.User;
import gaoshuai.service.UserService;
import gaoshuai.service.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.test4j.junit.Test4J;
import org.test4j.module.database.annotations.Transactional;
import org.test4j.module.spring.annotations.SpringBeanByName;
import org.test4j.module.spring.annotations.SpringContext;

/**
 * Created by gaoshuai on 2017/7/2.
 */
@SpringContext({"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class Test_spring extends Test4J{
//    @SpringBeanByName
    @Autowired
    private UserService userService;

//    public UserService getUserService(){
//        return userService;
//    }
//
//    public void setUserService(UserService userService){
//        this.userService=userService;
//    }
    @Test
//    @Transactional(Transactional.TransactionMode.COMMIT)
//    @Rollback(false)
    public void testInsertUser(){
        User user=new User();
        user.setId(18);
        user.setUserName("礼物");
        user.setSex("男");
        int updateRecord=userService.insertUser(user);
        Assert.assertEquals("hello", 1, updateRecord);
    }

}
