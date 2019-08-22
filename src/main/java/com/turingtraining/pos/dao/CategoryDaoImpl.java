/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.dao.model.Category;
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
public class CategoryDaoImpl implements CategoryDao{

    DAO dao = DAO.getDAO();
    
    @Override
    public void insertCategory(Category cat) {
        try {
            PreparedStatement st = dao.createStatement("INSERT INTO categories(name) values (?)");
            st.setString(1, cat.getName());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Category> getCategoryList() {
        List<Category> catList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("Select id, name from categories");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                Category cat = new Category(id, name);
                catList.add(cat);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return catList;
    }
        
    public static void main(String [] args) {
        CategoryDao dao = new CategoryDaoImpl();
//        Category cat = new Category("Book");
//        dao.insertCategory(cat);
        
        List<Category> catList = dao.getCategoryList();
        catList.forEach(System.out::println);
        
    }
}
