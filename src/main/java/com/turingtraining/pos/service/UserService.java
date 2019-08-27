/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.model.User;
import com.turingtraining.pos.dao.model.UserType;
import java.util.List;

/**
 *
 * @author DELL
 */
public interface UserService {

    void userLogin(User u) throws Exception;

    void registerUser(User u) throws Exception;
    
    List<UserType> getUserTypes();
}
