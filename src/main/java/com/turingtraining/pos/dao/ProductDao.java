/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.model.Product;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public interface ProductDao {

    List<Product> getProductList();
    void insertProduct(Product p);
    Product getProductDetail(Long pId);
    
}
