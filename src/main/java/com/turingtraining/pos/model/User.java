/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.turingtraining.pos.model;

/**
 *
 * @author DELL
 */
public class User {

    private String username;
    private String password;
    private Long usertype_id;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, Long usertype_id) {
        this.username = username;
        this.password = password;
        this.usertype_id = usertype_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUsertype_id() {
        return usertype_id;
    }

    public void setUsertype_id(Long usertype_id) {
        this.usertype_id = usertype_id;
    }
}
