/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.UserDao;
import com.turingtraining.pos.dao.UserDaoImpl;
import com.turingtraining.pos.dao.model.User;
import com.turingtraining.pos.dao.model.UserType;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void userLogin(User u) throws Exception {
        userDao.userLogin(u);
    }

    @Override
    public void registerUser(User u) throws Exception{
        userDao.registerUser(u);
    }

    @Override
    public List<UserType> getUserTypes() {
        return userDao.getUserTypes();
    }

}
