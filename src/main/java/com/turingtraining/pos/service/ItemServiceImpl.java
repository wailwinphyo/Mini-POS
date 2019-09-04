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

/**
 *
 * @author wailwinphyo
 */
public class ItemServiceImpl implements ItemService {

    ItemDao itemDao = new ItemDaoImpl();

    @Override
    public List<Item> getItemList() {
        return itemDao.getItemList();
    }

    @Override
    public void insertItem(Item p) throws Exception {
        itemDao.insertItem(p);
    }

    @Override
    public List<Item> getItemListByCatId(Long cId) {
        return itemDao.getItemListByCatId(cId);
    }

    @Override
    public List<Item> getRemainingItemQty() {
        return itemDao.getRemainingItemQty();
    }

    @Override
    public Item getItemDetail(String code) {
        return itemDao.getItemDetail(code);
    }

    @Override
    public void updateItem(Item item) throws Exception {
        itemDao.updateItem(item);
    }
}
