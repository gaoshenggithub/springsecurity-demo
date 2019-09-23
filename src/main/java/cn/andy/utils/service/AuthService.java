package cn.andy.utils.service;

import cn.andy.entity.User;

public interface AuthService {
    int register(User userToAdd);

    String login(String username, String password);
}