package club.guanghao.service.impl;

import club.guanghao.dao.UserDao;
import club.guanghao.entity.User;
import club.guanghao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 黄光昊
 * @create 2019-09-23-15:22
 */
@Service
public class TestUserService implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(User user) {
        return userDao.selectByCondition(user);
    }
}
