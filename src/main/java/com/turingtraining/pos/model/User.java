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

    private Long id;
    private String name;
    private String username;
    private String password;
    private Long usertype_id;
    private String userType;
    
    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Long getUsertype_id() {
        return usertype_id;
    }

    public User setUsertype_id(Long usertype_id) {
        this.usertype_id = usertype_id;
        return this;
    }

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getUserType() {
        return userType;
    }

    public User setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
}
