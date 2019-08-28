/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.exception.ItemException;
import com.turingtraining.pos.model.Stock;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class StockDaoImpl implements StockDao {

    DAO dao = DAO.getDAO();

    @Override
    public void persistStockTransaction(Stock s) throws Exception{
        try {
            PreparedStatement st = dao.createStatement("INSERT INTO stock_transactions(item_id, quantity, price, transaction_date, description) VALUES (?, ?, ?, ?, ?)");
            st.setLong(1, s.getItem_id());
            st.setInt(2, s.getQuantity());
            st.setDouble(3, s.getPrice());
            st.setLong(4, new Date().getTime());
            st.setString(5, "Stock Insertion");
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StockDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ItemException("Failed to persist stock transaction!");
        }
    }
}
