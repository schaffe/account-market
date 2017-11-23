package com.accountmarket.login.rest;

import com.accountmarket.entities.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping(method = GET)
    public User getUserById(@RequestBody UserDataDTO u) {
        return userRepository.findOne();
    }

    public static class UserDataDTO {
        String id;
    }
}
