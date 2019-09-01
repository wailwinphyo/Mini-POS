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
public class Item {

    private Long id;
    private String code;
    private String name;
    private Double price;
    private Integer quantity;
    private Long categoryId;
    private String categoryName;

    public Item() {
    }

    public Item(Long id, String code, String name, Double price, Integer quantity, Long categoryId, String categoryName) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    
    
    public Item(Long id, String name, String code, Double price, Long categoryId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return code + " - " + name;
    }

    public static class ItemBuilder {
        
        private Long id;
        private String name;
        private String code;
        private Double price;
        private Integer qty;
        private Long catId;
        private String catName;     

        public static ItemBuilder getInstance(){
            return new ItemBuilder();
        }
        
        public ItemBuilder setId(Long id){
            this.id = id;
            return this;
        }
        
        public ItemBuilder setName(String name){
            this.name = name;
            return this;
        }
        
        public ItemBuilder setPrice(Double price){
             this.price = price;
             return this;
        }
        
        public ItemBuilder setCode(String code){
            this.code = code;
            return this;
        }
        
        public ItemBuilder setQuantity(Integer qty){
            this.qty = qty;
            return this;
        }
        
        private ItemBuilder setCategoryId(Long catId){
            this.catId = catId;
            return this;
        }
        private ItemBuilder setCategoryName(String catName){
            this.catName = catName;
            return this;
        }
        
        public Item build(){
            Item item = new Item(id, name, code, price, qty, catId, catName);
            return item;
        }
    }
}
