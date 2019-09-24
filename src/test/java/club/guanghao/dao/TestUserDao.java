package club.guanghao.dao;

import club.guanghao.BaseTest;
import club.guanghao.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 黄光昊
 * @create 2019-09-23-14:30
 */
public class TestUserDao extends BaseTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testSelectByCondition() {
        User user = new User();
        user.setUserName("testname");
        user.setUserPassword("123456");
        Assert.assertEquals("testname", userDao.selectByCondition(user).getUserName());
    }
}
