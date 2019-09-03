/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.model.User;
import com.turingtraining.pos.model.UserType;
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
    public User getUser(User u) throws Exception {
        PreparedStatement st = dao.createStatement("SELECT u.id, u.name, ut.role FROM users u INNER JOIN user_types ut ON ut.id = u.user_type_id WHERE u.username = ? and u.password = ?");
        st.setString(1, u.getUsername());
        st.setString(2, u.getPassword());
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            Long id = rs.getLong("id");
            String name = rs.getString("name");
            String type = rs.getString("role");
            return new User().setId(id).setName(name).setUserType(type);
        }
        throw new UserException("Incorrect Username and Password!");
    }

    @Override
    public void registerUser(User u) throws Exception {
        if (checkUsername(u.getUsername())) {
            try {
                PreparedStatement st = dao.createStatement("INSERT INTO users(name, username, password, user_type_id) VALUES(?, ?, ?, ?)");
                st.setString(1, u.getName());
                st.setString(2, u.getUsername());
                st.setString(3, u.getPassword());
                st.setLong(4, u.getUsertype_id());
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
            PreparedStatement st = dao.createStatement("SELECT id FROM users WHERE username = ?");
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
            PreparedStatement st = dao.createStatement("SELECT id, name FROM user_types");
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

//    public static void main(String[] args) {
//        User u = new User("admin", "admin2", 1L);
//        UserDao userDao = new UserDaoImpl();
//        try {
//            userDao.userLogin(u);
//            System.out.println("Login Success");
//        } catch (Exception ex) {
//            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    @Override
    public List<User> getCashierList() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT u.id, u.name FROM users u "
                    + "INNER JOIN user_types ut ON u.user_type_id = ut.id "
                    + "WHERE ut.role = ? ");
            st.setString(1, "ROLE_CASHIER");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                User u = new User().setId(id).setName(name);
                userList.add(u);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }

    @Override
    public List<User> getAllUserList() {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT u.id, u.name, u.username, ut.name as usertype "
                    + "FROM users u "
                    + "INNER JOIN user_types ut ON ut.id = u.user_type_id");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String username = rs.getString("username");
                String userType = rs.getString("usertype");
                User u = new User().setId(id).setName(name).setUsername(username).setUserType(userType);
                userList.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userList;
    }

    @Override
    public void deleteUserById(Long id) throws Exception {
        try {
            PreparedStatement st = dao.createStatement("DELETE FROM users where id = ?");
            st.setLong(1, id);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, ex.getMessage());
            throw new Exception("Failed to delete user !");
        }
    }
}
