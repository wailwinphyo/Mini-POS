/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.model;

/**
 *
 * @author wailwinphyo
 */
public class Product {

    private long id;
    private String code;
    private String name;
    private double price;
    private int quantity;
    private long categoryId;
    private String categoryName;

    public Product(){
        
    }
    
    public Product(long id, String name, String code, double price, int quantity) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, String code, double price, long categoryId){
        this.name = name;
        this.code = code;
        this.price = price;
        this.categoryId = categoryId;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode(){
        return code;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
    
    @Override
    public String toString() {
        return "ID - " + id + " | name - " + name + " | code - " + code + " | price - " + price + " | quantity - " + quantity;
    }

}