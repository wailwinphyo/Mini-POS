/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.model.Category;
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
    public void insertCategory(Category cat) throws Exception{
        try {
            PreparedStatement st = dao.createStatement("INSERT INTO categories(name, description) values (?, ?)");
            st.setString(1, cat.getName());
            st.setString(2, cat.getDescription());
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }

    @Override
    public List<Category> getCategoryList() {
        List<Category> catList = new ArrayList<>();
        try {
            PreparedStatement st = dao.createStatement("Select id, name, description from categories");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String desc = rs.getString("description");
                Category cat = new Category(id, name, desc);
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
//        dao.insertCateg   ory(cat);
        
        List<Category> catList = dao.getCategoryList();
        catList.forEach(System.out::println);
        
    }
}
