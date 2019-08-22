/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.model.Category;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public interface CategoryService {

    List<Category> getCategoryList();

    void insertCategory(Category cat);
    
}
