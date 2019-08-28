/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.service;

import com.turingtraining.pos.model.Item;
import java.util.List;

/**
 *
 * @author wailwinphyo
 */
public interface ItemService {

    List<Item> geItemList();

    void insertItem(Item item);
}
