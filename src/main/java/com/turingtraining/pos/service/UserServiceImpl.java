/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.UserDao;
import com.turingtraining.pos.dao.UserDaoImpl;
import com.turingtraining.pos.dao.model.User;

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

}
