package com.Shubham.service;

import com.Shubham.entity.User;

public interface UserService {
    User signup(User user);

    String login(String username, String password);
}
