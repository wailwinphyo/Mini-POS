/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.model.Product;
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
public class ProductDaoImpl implements ProductDao {
    private final DAO dao = DAO.getDAO();

    @Override
    public List<Product> getProductList() {
        List<Product> prodList = new ArrayList<>();
        try {            
            PreparedStatement st = dao.createStatement("SELECT p.id, p.name, p.code, p.price, p.quantity, cat.name as category FROM products p INNER JOIN categories cat on cat.id = p.category_id");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Integer qty = rs.getInt("quantity");
                String category = rs.getString("category");
                Product p = new Product(id, name, code, price, qty);
                p.setCategoryName(category);
                prodList.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prodList;
    }

    @Override
    public void insertProduct(Product p) {
        try {
            PreparedStatement st = dao.createStatement("INSERT INTO products (name, code, price, category_id) VALUES (?, ?, ?, ?)");
            st.setString(1, p.getName());
            st.setString(2, p.getCode());
            st.setDouble(3, p.getPrice());
            st.setLong(4, p.getCategoryId());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Product getProductDetail(Long pId) {
        
        try {
            PreparedStatement st = dao.createStatement("SELECT id, name, code, price from Product where id = ?");
            st.setLong(1, pId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Product p = new Product(id, name, code, price, 0);
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Product();
    }
    
    
    public static void main(String[] args){
        ProductDao dao = new ProductDaoImpl();
        Product p = new Product("Hot Dog 2", "FD-103", 1000, 1);
        dao.insertProduct(p);
        List<Product> pList = dao.getProductList();
        pList.forEach(System.out::println);
    }
    
}
