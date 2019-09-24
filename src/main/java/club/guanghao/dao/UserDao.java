package club.guanghao.dao;

import club.guanghao.entity.User;

/**
 * @author 黄光昊
 * @create 2019-09-23-14:17
 */
public interface UserDao {
    /*
    * 根据条件查询用用户信息
    */
    User selectByCondition(User user);
}
