package com.sora.demo.service;

import com.sora.demo.mbg.model.User;

import java.util.List;

public interface UserService {
    List<User> listAllUser();

    int createUser(User user);

    User retrieveUser(int id);

    int updateUser(User user);

    int deleteUser(int id);

    /**
     * 后台用户，检查是否存在管理员或讲师username
     * @param username 用户名
     * @return boolean, true为存在， false为不存在
     */
    boolean retrieveUserByUsername(String username);

    /**
     * 后台用户，检查username和password是否匹配
     * @param username 用户名
     * @param password 密码
     * @return boolean,true为匹配成功，false为匹配失败
     */
    boolean checkUsernameAndPassword(String username, String password);

    /**
     * 后台用户，检查用户登录权限
     * @param username 用户名
     * @param password 密码
     * @return boolean, true为管理员用户，false为讲师用户
     */
    boolean checkUser_Status(String username, String password);

    /**
     * 微信小程序，检查是否存在学生username
     * @param username 用户名
     * @return boolean， true为存在， false为不存在
     */
    boolean retrieveStudentByUsername(String username);

    /**
     * 微信小程序，检查学生username和password是否匹配
     * @param username 用户名
     * @param password 密码
     * @return boolean,true为匹配成功，false为匹配失败
     */
    boolean checkStudentUsernameAndPassword(String username, String password);
}
