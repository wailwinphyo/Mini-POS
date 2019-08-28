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
public class Stock {

    private Long item_id;
    private Double price;
    private Integer quantity;
    private String description;

    public Stock(Long item_id, Double price, Integer quantity, String description) {
        this.item_id = item_id;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
