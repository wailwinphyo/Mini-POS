/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.ItemDao;
import com.turingtraining.pos.dao.ItemDaoImpl;
import com.turingtraining.pos.dao.StockDao;
import com.turingtraining.pos.dao.StockDaoImpl;
import com.turingtraining.pos.model.Item;
import com.turingtraining.pos.model.Stock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wailwinphyo
 */
public class StockServiceImpl implements StockService {

    StockDao stockDao = new StockDaoImpl();
    ItemDao itemDao = new ItemDaoImpl();

    @Override
    public void refillStock(Stock s) throws Exception {
        stockDao.persistStockTransaction(s);
    }
    
    @Override
    public void reduceStock(Stock s) throws Exception {
        stockDao.persistStockTransaction(s);
    }

    public static void main(String[] args) {
        Stock s = new Stock(1L, 200.0, 5, "Stock Insertion");
        StockServiceImpl stockSvc = new StockServiceImpl();
        try {
            stockSvc.refillStock(s);
        } catch (Exception ex) {
            Logger.getLogger(StockServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
