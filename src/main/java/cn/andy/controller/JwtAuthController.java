package cn.andy.controller;

import cn.andy.entity.User;
import cn.andy.utils.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthController {
    @Autowired
    private AuthService authService;

    // 登录
    @RequestMapping(value = "/authentication/login", method = RequestMethod.POST)
    public String createToken(String username, String password) {
        return authService.login(username, password); // 登录成功会返回JWT Token给用户
    }

    // 注册
    @RequestMapping(value = "/authentication/register", method = RequestMethod.POST)
    public int register(@RequestBody User addedUser) {
        return authService.register(addedUser);
    }
}