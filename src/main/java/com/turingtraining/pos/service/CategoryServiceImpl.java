/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.CategoryDao;
import com.turingtraining.pos.dao.CategoryDaoImpl;
import com.turingtraining.pos.model.Category;
import java.util.List;


/**
 *
 * @author wailwinphyo
 */
public class CategoryServiceImpl implements CategoryService {
    
    CategoryDao catDao = new CategoryDaoImpl();
    
    @Override
    public void insertCategory(Category cat) throws Exception{
        catDao.insertCategory(cat);
    }
    
    @Override
    public List<Category> getCategoryList(){
        return catDao.getCategoryList();
    }

    @Override
    public List<Category> getCategoryListForStock() {
        return catDao.getCategoryListForStock();
    }
    
    

}
