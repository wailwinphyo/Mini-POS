/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.UserDao;
import com.turingtraining.pos.dao.UserDaoImpl;
import com.turingtraining.pos.model.User;
import com.turingtraining.pos.model.UserType;
import com.turingtraining.pos.util.SystemUtil;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void userLogin(User u) throws Exception {
        User user = userDao.getUser(u);
        SystemUtil.setUser(user);
    }

    @Override
    public void registerUser(User u) throws Exception{
        userDao.registerUser(u);
    }

    @Override
    public List<UserType> getUserTypes() {
        return userDao.getUserTypes();
    }

    @Override
    public List<User> getCashierList() {
        return userDao.getCashierList();
    }

    @Override
    public List<User> getAllUserList() {
        return userDao.getAllUserList();
    }

    @Override
    public void deleteUserById(Long id) throws Exception {
        userDao.deleteUserById(id);
    }
    
}
