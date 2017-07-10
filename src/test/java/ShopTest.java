import gaoshuai.service.Heool;
import org.junit.Assert;
import org.junit.Test;
import org.test4j.junit.Test4J;
import org.test4j.module.spring.annotations.SpringBeanByName;
import org.test4j.module.spring.annotations.SpringContext;

/**
 * Created by gaoshuai on 2017/6/29.
 */
@SpringContext({
    "application.xml",
})
public class ShopTest extends Test4J{
    @SpringBeanByName
    private Heool heool;
    @Test
    public void test(){
        heool.say();
        Assert.assertEquals("","");
    }

}
