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
import java.util.Date;
import java.util.List;
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
        Item item = new Item.ItemBuilder().setId(s.getItem_id()).setQuantity(s.getQuantity()).setPrice(s.getPrice()).build();
        itemDao.addItemStock(item);
    }

    
    @Override
    public void purchaseItem(List<Item> values)throws Exception{
        for(Item item : values){
            Stock s = new Stock(item.getId(), item.getPrice(), -item.getQuantity(), "purchase item");
            stockDao.persistStockTransaction(s);
            itemDao.purchaseItem(item);
        }
    }    
    
    @Override
    public List<Stock> getStockList() {
        return null;
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
    
    @Override
    public List<Item> getSaleReport(Long cId, Long startDate, Long endDate){
        return stockDao.getSaleReport(cId, startDate, endDate);
    }

    @Override
    public List<Item> getMonthlyReport(Date date) {
        return stockDao.getMonthlyReport(date);
    }

}
