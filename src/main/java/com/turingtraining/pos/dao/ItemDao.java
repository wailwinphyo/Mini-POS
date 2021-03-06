/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.dao;

import com.turingtraining.pos.model.Item;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public interface ItemDao {

    List<Item> getItemList();

    void insertItem(Item p) throws Exception;

    Item getItemDetail(String code);

    public void addItemStock(Item item) throws Exception;

    public void purchaseItem(Item item) throws Exception;

    List<Item> getItemListByCatId(Long cId);

    public List<Item> getRemainingItemQty();

    public void updateItem(Item item)throws Exception;

}
