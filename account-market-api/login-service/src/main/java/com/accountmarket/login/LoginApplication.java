package com.accountmarket.login;

import com.accountmarket.login.data.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.inject.Inject;

@SpringBootApplication
public class LoginApplication implements CommandLineRunner {
    @Inject
    private UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(LoginApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        repository.deleteAll();
//
//        repository.save(new User("vasyl"));
//        repository.save(new User("petro"));

        System.out.println("All users");
        System.out.println(repository.findAll());

        System.out.println(repository.findByName("vasyl"));
    }
}
