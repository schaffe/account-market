package com.accountmarket.login.rest;

import com.accountmarket.login.User;
import com.accountmarket.login.data.UserRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private final UserRepository userRepository;

    @Inject
    public LoginController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = POST)
    public User register(@RequestBody RegistrationDataDTO reg) {
        User u = new User(reg.name);
        u = userRepository.save(u);
        return u;
    }

    @RequestMapping(method = GET)
    public List<User> getAll() {
        return userRepository.findAll();
    }

    public static class RegistrationDataDTO {
        String name;

        public RegistrationDataDTO() {
        }

        public String getName() {
            return name;
        }

        public RegistrationDataDTO setName(String name) {
            this.name = name;
            return this;
        }
    }
}
