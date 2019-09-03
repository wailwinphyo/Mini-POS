/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.exception.ItemException;
import com.turingtraining.pos.model.Item;
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
    public List<Item> getItemListByCatId(Long cId) {
        List<Item> prodList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT p.id, p.name, p.code, p.price FROM items p INNER JOIN categories cat on cat.id = p.category_id WHERE cat.id = ? ORDER BY p.name");
            st.setLong(1, cId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Item p = new Item.ItemBuilder().setId(id).setName(name).setCode(code).setPrice(price).build();
                prodList.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prodList;
    }

    @Override
    public List<Item> getItemList() {
        List<Item> prodList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT p.id, p.name, p.code, p.price, p.quantity, cat.name as category FROM items p INNER JOIN categories cat on cat.id = p.category_id ORDER BY p.name");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Integer qty = rs.getInt("quantity");
                String category = rs.getString("category");
                Item p = new Item.ItemBuilder().setId(id).setName(name).setCode(code).setPrice(price).build();
                p.setCategoryName(category);
                p.setQuantity(qty);
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
    public Item getItemDetail(String scode) {

        try {
            PreparedStatement st = dao.createStatement("SELECT id, name, code, price, quantity from items where code = ?");
            st.setString(1, scode);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Integer qty = rs.getInt("quantity");
                return new Item.ItemBuilder().setId(id).setName(name).setCode(code).setPrice(price).setQuantity(qty).build();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Item();
    }

    @Override
    public void purchaseItem(Item item) throws Exception {
        try {
            PreparedStatement st = dao.createStatement("UPDATE items SET quantity = quantity - ?, price = ? WHERE id = ?");
            st.setInt(1, item.getQuantity());
            st.setDouble(2, item.getPrice());
            st.setLong(3, item.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ItemException("Failed to update item");
        }
    }

    @Override
    public void addItemStock(Item item) throws Exception {
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

    @Override
    public List<Item> getRemainingItemQty() {
        List<Item> itemList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("SELECT item.name, item.code, item.quantity "
                    + "FROM items item "
                    + "INNER JOIN stock_transactions s ON s.item_id = item.id "
                    + "GROUP BY item.id "
                    + "ORDER BY item.quantity desc");

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String code = rs.getString("code");
                int quantity = rs.getInt("quantity");
                Item item = new Item.ItemBuilder().setName(name).setCode(code).setQuantity(quantity).build();
                itemList.add(item);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itemList;
    }

    @Override
    public void updateItem(Item item) throws Exception {
        try {
            PreparedStatement st = dao.createStatement("UPDATE items SET name = ?, code = ?, price = ? WHERE id = ?");
            st.setString(1, item.getName());
            st.setString(2, item.getCode());
            st.setDouble(3, item.getPrice());
            st.setLong(4, item.getId());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ItemDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new Exception("Failed to update item" + item.getName());
        }
    }

    public static void main(String[] args) {
        ItemDao dao = new ItemDaoImpl();
        Item p = new Item.ItemBuilder().setName("Hot Dog 2").setCode("FD-103").setPrice(1000.0).setCategoryId(1L).build();
        dao.insertItem(p);
        List<Item> pList = dao.getItemList();
        pList.forEach(System.out::println);
    }
}
