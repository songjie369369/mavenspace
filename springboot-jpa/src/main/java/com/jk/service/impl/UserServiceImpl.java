package com.jk.service.impl;

import com.jk.mapper.UserMapper;
import com.jk.model.User;
import com.jk.service.IUserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.findAll();
    }

    @Override
    public void addUser(User user) {
        userMapper.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userMapper.delete(user);
    }

    @Override
    public User queryUserById(Integer id) {
        return userMapper.getOne(id);
    }

    @Override
    public void updateUser(User user) {
    userMapper.save(user);
    }

    @Override
    public List<User> queryUserListAnnotion() {
        return null;
    }
}
