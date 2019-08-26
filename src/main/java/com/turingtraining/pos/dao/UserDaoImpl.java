/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.dao.model.User;
import com.turingtraining.pos.exception.UserNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class UserDaoImpl implements UserDao {

    DAO dao = DAO.getDAO();

    @Override
    public void userLogin(User u) throws Exception {
        PreparedStatement st = dao.createStatement("SELECT id FROM users WHERE username = ? and password = ?");
        st.setString(1, u.getUsername());
        st.setString(2, u.getPassword());
        ResultSet rs = st.executeQuery();
        Long id = null;
        while (rs.next()) {
            id = rs.getLong("id");
        }
        if (id == null) {
            throw new UserNotFoundException("Incorrect Username and Password!");
        }
    }

    public static void main(String[] args) {
        User u = new User("admin", "admin2");
        UserDao userDao = new UserDaoImpl();
        try {
            userDao.userLogin(u);
            System.out.println("Login Success");
        } catch (Exception ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
