package gaoshuai.service;
import gaoshuai.dao.TestMapper;
import gaoshuai.pojo.Test;
import gaoshuai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaoshuai on 2017/6/29.
 */
@Service("testService")
public class TestServiceImp implements TestService {
    @Autowired(required = false)
    private TestMapper testMapper = null;

    public Test getById(int id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
