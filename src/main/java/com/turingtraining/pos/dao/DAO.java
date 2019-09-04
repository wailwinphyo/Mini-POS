/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class DAO {

    private static String CONN_STR;
    private static String DB_USER;
    private static String DB_PASS;

    private Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            loadConfig();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static DAO obj = null;

    private DAO() {
        try {
            this.conn = DriverManager.getConnection(CONN_STR, DB_USER, DB_PASS);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DAO getDAO() {
        if (obj == null) {
            obj = new DAO();
        }
        return obj;
    }

    public PreparedStatement createStatement(String query) {
        PreparedStatement st = null;
        try {
            st = this.conn.prepareStatement(query);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return st;
    }
    
    private static void loadConfig() throws FileNotFoundException, IOException {
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            CONN_STR = prop.getProperty("db.url");
            DB_USER = prop.getProperty("db.user");
            DB_PASS = prop.getProperty("db.password");
        }

    }

    public static void main(String[] args) {
        DAO dao = getDAO();
    }
}
