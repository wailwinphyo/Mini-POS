/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.model.Item;
import com.turingtraining.pos.model.Stock;
import java.util.Date;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public interface StockDao {

    void persistStockTransaction(Stock s) throws Exception;

    List<Item> getSaleReport(Long cId, Long startDate, Long endDate);

    public List<Item> getMonthlyReport(Date date);

}
