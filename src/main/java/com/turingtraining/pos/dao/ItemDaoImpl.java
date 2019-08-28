/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.exception.ItemException;
import com.turingtraining.pos.model.Item;
import com.turingtraining.pos.model.Stock;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class ItemDaoImpl implements ItemDao {

    private final DAO dao = DAO.getDAO();

    @Override
    public List<Item> getItemList() {
        List<Item> prodList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT p.id, p.name, p.code, p.price, p.quantity, cat.name as category FROM items p INNER JOIN categories cat on cat.id = p.category_id");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Integer qty = rs.getInt("quantity");
                String category = rs.getString("category");
                Item p = new Item(id, name, code, price, qty);
                p.setCategoryName(category);
                prodList.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prodList;
    }

    @Override
    public void insertItem(Item p) {
        try {
            PreparedStatement st = dao.createStatement("INSERT INTO items (name, code, price, category_id) VALUES (?, ?, ?, ?)");
            st.setString(1, p.getName());
            st.setString(2, p.getCode());
            st.setDouble(3, p.getPrice());
            st.setLong(4, p.getCategoryId());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Item getItemDetail(Long pId) {

        try {
            PreparedStatement st = dao.createStatement("SELECT id, name, code, price from items where id = ?");
            st.setLong(1, pId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Item p = new Item(id, name, code, price, 0);
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Item();
    }

    @Override
    public void updateItem(Item item) throws Exception {
        try {
            PreparedStatement st = dao.createStatement("UPDATE items SET quantity = quantity + ?, price = ? WHERE id = ?");
            st.setInt(1, item.getQuantity());
            st.setDouble(2, item.getPrice());
            st.setLong(3, item.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ItemException("Failed to update item");
        }
    }

    public static void main(String[] args) {
        ItemDao dao = new ItemDaoImpl();
        Item p = new Item("Hot Dog 2", "FD-103", 1000, 1);
        dao.insertItem(p);
        List<Item> pList = dao.getItemList();
        pList.forEach(System.out::println);
    }

}
