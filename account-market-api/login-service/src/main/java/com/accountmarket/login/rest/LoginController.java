package com.accountmarket.login.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class LoginController {

    @RequestMapping(method = GET)
    public User hello() {
        User u = new User("Oleg");
        return u;
    }

}
