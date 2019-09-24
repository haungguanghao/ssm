package club.guanghao.service;

import club.guanghao.entity.User;

/**
 * @author 黄光昊
 * @create 2019-09-23-15:17
 */
public interface UserService {

    /**
     * 将前台拿到的 User到 dao 层查询，返回 User 对象
     * @param user
     * @return
     */
    public User getUser(User user);
}
