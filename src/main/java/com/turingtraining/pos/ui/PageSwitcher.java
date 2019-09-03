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
public class PageSwitcher {
    public static void ItemPage(JFrame obj){
        new ItemPage().setVisible(true);
        obj.dispose();
    }

    public static void CategoryPage(JFrame obj) {
        new CategoryPage().setVisible(true);
        obj.dispose();
    }

    public static void showSaleReport(JFrame obj) {
        new SaleReport().setVisible(true);
        obj.dispose();
    }

    public static void showMonthlySaleReport(JFrame obj) {
        new MonthlySaleReport().setVisible(true);
        obj.dispose();
    }

    public static void showRemainingStock(JFrame obj) {
        new StockReport().setVisible(true);
        obj.dispose();
    }

    public static void returnHome(JFrame obj) {
        new SalePage().setVisible(true);
        obj.dispose();
    }

    static void registerNewCashier(JFrame obj) {
        new UserRegistrationPage().setVisible(true);
        obj.dispose();
    }
}
