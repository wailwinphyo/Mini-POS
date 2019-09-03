/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class DAO {

    private static final String CONN_STR = "jdbc:mysql://localhost:3306/pos_wlp?characterEncoding=latin1";

    private Connection conn = null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private static DAO obj = null;

    private DAO() {
        try {
            this.conn = DriverManager.getConnection(CONN_STR, "root", "root");
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

    public static void main(String[] args) {
        DAO dao = getDAO();
    }
}
