package com.accountmarket.entities;

import org.springframework.data.annotation.Id;

public class Account {
    @Id
    private String id;
    private Platform platform;
    private String login;
    private String password;
    private User owner;

    public Account(Platform platform, String login, String password, User owner) {
        this.platform = platform;
        this.login = login;
        this.password = password;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
