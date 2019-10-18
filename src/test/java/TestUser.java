import com.gaofv.dao.UserDAO;
import com.gaofv.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Auther: GF
 * @Date: 2019/10/18
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestUser {
    @Autowired
    private UserDAO userDAO;

    @Test
    public void test(){
        List<User> users = userDAO.selectAll();
        System.out.println(users);
    }
}
