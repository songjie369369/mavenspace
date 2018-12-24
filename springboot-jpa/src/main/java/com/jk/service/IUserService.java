package com.jk.service;

import com.jk.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface IUserService {

    List<User> queryUserList();

    void addUser(User user);

    void deleteUser(User user);

    User queryUserById(Integer id);

    void updateUser(User user);

    List<User> queryUserListAnnotion();
}
