package club.guanghao.controller;

import club.guanghao.entity.User;
import club.guanghao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 黄光昊
 * @create 2019-09-23-15:24
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "/user/login";
    }

    @RequestMapping(value = "/dologin", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> doLogin(User user, HttpSession session) {
        Map<String, Object> mapModel = new HashMap<String, Object>();
        User realUser = userService.getUser(user);
        System.out.println(realUser);
        if (realUser != null) {
            session.setAttribute("user", user);
            mapModel.put("success", true);
        } else {
            mapModel.put("success", false);
            mapModel.put("errMsg", "账号或密码输入错误");
        }
        return mapModel;
    }

}
