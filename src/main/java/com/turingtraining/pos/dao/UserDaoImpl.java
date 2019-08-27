/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.dao.model.User;
import com.turingtraining.pos.dao.model.UserType;
import com.turingtraining.pos.exception.UserException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
            throw new UserException("Incorrect Username and Password!");
        }
    }

    @Override
    public void registerUser(User u) throws Exception {
        if (checkUsername(u.getUsername())) {
            try {
                PreparedStatement st = dao.createStatement("INSERT INTO Users(username, password, usertype_id) VALUES(?, ?, ? )");
                st.setString(1, u.getUsername());
                st.setString(2, u.getPassword());
                st.setLong(3, u.getUsertype_id());
                st.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                throw new Exception("Failed to register user !");
            }
        } else {
            throw new UserException("User already exists !");
        }
    }

    private boolean checkUsername(String username) {
        try {
            PreparedStatement st = dao.createStatement("SELECT id FROM Users WHERE username = ?");
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            return !rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<UserType> getUserTypes() {
        List<UserType> userTypeList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT id, name FROM UserTypes");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                UserType u = new UserType(id, name);
                userTypeList.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userTypeList;
    }

    public static void main(String[] args) {
        User u = new User("admin", "admin2", 1L);
        UserDao userDao = new UserDaoImpl();
        try {
            userDao.userLogin(u);
            System.out.println("Login Success");
        } catch (Exception ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
