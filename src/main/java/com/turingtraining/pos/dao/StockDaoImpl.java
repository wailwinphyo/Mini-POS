/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.exception.ItemException;
import com.turingtraining.pos.model.Item;
import com.turingtraining.pos.model.Stock;
import com.turingtraining.pos.util.SystemUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class StockDaoImpl implements StockDao {

    DAO dao = DAO.getDAO();

    @Override
    public void persistStockTransaction(Stock s) throws Exception {
        Long cashierId = SystemUtil.getCurrentUser().getId();
        try {
            PreparedStatement st = dao.createStatement("INSERT INTO stock_transactions(item_id, quantity, price, transaction_date, description, cashier_id) VALUES (?, ?, ?, ?, ?, ?)");
            st.setLong(1, s.getItem_id());
            st.setInt(2, s.getQuantity());
            st.setDouble(3, s.getPrice());
            st.setLong(4, new Date().getTime());
            st.setString(5, "Stock Insertion");
            st.setLong(6, cashierId);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StockDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ItemException("Failed to persist stock transaction!");
        }
    }

    @Override
    public List<Item> getSaleReport(Long cId, Long startDate, Long endDate) {
        List<Item> saleList = new ArrayList<>();
        try {
            PreparedStatement st = dao
                    .createStatement("SELECT i.code, i.name, ABS(SUM(s.quantity)) as quantity, ABS(SUM(s.price * s.quantity)) as totalPrice "
                            + "FROM stock_transactions s "
                            + "INNER JOIN items i ON i.id = s.item_id "
                            + "WHERE s.quantity < 0 AND s.cashier_id = ? "
                            + "AND s.transaction_date BETWEEN ? AND ? "
                            + "GROUP BY s.item_id");
            st.setLong(1, cId);
            st.setLong(2, startDate);
            st.setLong(3, endDate);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String code = rs.getString("code");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                double totalPrice = rs.getDouble("totalPrice");
                Item item = new Item.ItemBuilder()
                        .setCode(code)
                        .setName(name)
                        .setQuantity(quantity)
                        .setPrice(totalPrice).build();
                saleList.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saleList;
    }

    @Override
    public List<Item> getMonthlyReport(Date date) {
        List<Item> saleList = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, 1);
        try {
            PreparedStatement st = dao
                    .createStatement("SELECT i.code, i.name, ABS(SUM(s.quantity)) as quantity, ABS(SUM(s.price * s.quantity)) as totalPrice "
                            + "FROM stock_transactions s "
                            + "INNER JOIN items i ON i.id = s.item_id "
                            + "WHERE s.quantity < 0 "
                            + "AND s.transaction_date BETWEEN ? AND ? "
                            + "GROUP BY s.item_id");
            st.setLong(1, date.getTime());
            st.setLong(2, cal.getTimeInMillis());
//            System.out.println(date.getTime() + "  " + cal.getTimeInMillis());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String code = rs.getString("code");
                String name = rs.getString("name");
                int quantity = rs.getInt("quantity");
                double totalPrice = rs.getDouble("totalPrice");
                Item item = new Item.ItemBuilder()
                        .setCode(code)
                        .setName(name)
                        .setQuantity(quantity)
                        .setPrice(totalPrice).build();
                saleList.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StockDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return saleList;
    }
}
