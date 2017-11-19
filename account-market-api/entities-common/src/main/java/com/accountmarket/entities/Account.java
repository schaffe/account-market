package com.accountmarket.entities;

import org.springframework.data.annotation.Id;

public class Account {
    @Id
    String id;
    Platform platform;
    String login;
    String password;
    User owner;

}
