/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.ui;

import javax.swing.JFrame;

/**
 *
 * @author wailwinphyo
 */
public class UiManager {
    public void addItem(JFrame obj){
        new ItemPage().setVisible(true);
        obj.dispose();
    }
    
    public void returnHome(JFrame obj){
        new HomePage().setVisible(true);
        obj.dispose();
    }

    void addCategory(JFrame obj) {
        new CategoryPage().setVisible(true);
        obj.dispose();
    }
}
