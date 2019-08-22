/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.dao.model.Product;
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
    public List<Product> getProductListByCatId(int catId) {
        List<Product> prodList = new ArrayList<>();
        try {            
            PreparedStatement st = dao.createStatement("SELECT id, name, code, price, quantity FROM products WHERE category_id = ?");
            st.setInt(1, catId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                Double price = rs.getDouble("price");
                Integer qty = rs.getInt("quantity");
                Product p = new Product(id, name, code, price, qty);
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
            st.setLong(4, p.getCategory_id());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args){
        ProductDao dao = new ProductDaoImpl();
        Product p = new Product("Hot Dog", "FD-103", 1000, 1);
        dao.insertProduct(p);
        List<Product> pList = dao.getProductListByCatId(1);
        pList.forEach(System.out::println);
    }
    
}
