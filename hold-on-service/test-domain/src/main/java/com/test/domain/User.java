package com.test.domain;

import java.util.List;

/**
 * Created by songzheqi on 15/8/19.
 */
public class User {
    private int id;
    private String username;
    private String userpassword;
    private List<Goods> goods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public List<Goods> getGoods() {
        return goods;
    }
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", userpassword=" + userpassword + "]";
    }
}
