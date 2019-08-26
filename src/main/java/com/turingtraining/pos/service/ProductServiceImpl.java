/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.ProductDao;
import com.turingtraining.pos.dao.ProductDaoImpl;
import com.turingtraining.pos.model.Product;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public class ProductServiceImpl implements ProductService {
    
    ProductDao productDao = new ProductDaoImpl();
    
    @Override
    public List<Product> getProductList() {
        return productDao.getProductList();
    }

    @Override
    public void insertProduct(Product p) {
        productDao.insertProduct(p);
    }
    
}
