package com.sora.demo.service.impl;

import com.sora.demo.mbg.mapper.UserMapper;
import com.sora.demo.mbg.model.User;
import com.sora.demo.mbg.model.UserExample;
import com.sora.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAllUser() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public int createUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User retrieveUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean retrieveUserByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUserStatusNotEqualTo(2);
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }

    @Override
    public boolean checkUsernameAndPassword(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password).andUserStatusNotEqualTo(2);
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }

    @Override
    public boolean checkUser_Status(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password).andUserStatusEqualTo(0);
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }

    @Override
    public boolean retrieveStudentByUsername(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andUserStatusEqualTo(2);
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }

    @Override
    public boolean checkStudentUsernameAndPassword(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password).andUserStatusEqualTo(2);
        List<User> users = userMapper.selectByExample(userExample);
        return !users.isEmpty();
    }
}
