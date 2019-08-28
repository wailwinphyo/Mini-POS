/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.dao.ItemDaoImpl;
import com.turingtraining.pos.model.Item;
import java.util.List;
import com.turingtraining.pos.dao.ItemDao;
import com.turingtraining.pos.dao.StockDao;
import com.turingtraining.pos.dao.StockDaoImpl;
import com.turingtraining.pos.model.Stock;

/**
 *
 * @author wailwinphyo
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = new ItemDaoImpl();
    StockDao stockDao = new StockDaoImpl();

    @Override
    public List<Item> geItemList() {
        return itemDao.getItemList();
    }

    @Override
    public void insertItem(Item p) {
        itemDao.insertItem(p);
    }

}
