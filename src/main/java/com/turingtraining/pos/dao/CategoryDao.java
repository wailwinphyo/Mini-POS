/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.dao.model.Category;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public interface CategoryDao {
    public void insertCategory(Category cat);
    public List<Category> getCategoryList();
}
