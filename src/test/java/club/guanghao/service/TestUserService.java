package club.guanghao.service;

import club.guanghao.BaseTest;
import club.guanghao.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 黄光昊
 * @create 2019-09-23-19:53
 */
public class TestUserService extends BaseTest {
    @Autowired
    private UserService userService;

    @Test
    public void testGetUser(){
        User user = new User();
        user.setUserName("testname");
        user.setUserPassword("123456");
        Assert.assertEquals("testname", userService.getUser(user).getUserName());
    }
}
