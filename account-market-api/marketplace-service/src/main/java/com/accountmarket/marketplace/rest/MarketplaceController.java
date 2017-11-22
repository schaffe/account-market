package com.accountmarket.marketplace.rest;

import com.accountmarket.entities.Account;
import com.accountmarket.entities.Platform;
import com.accountmarket.entities.User;
import com.accountmarket.marketplace.data.AccountRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.inject.Inject;

public class MarketplaceController {

    private final AccountRepository accountRepository;

    @Inject
    public MarketplaceController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @RequestMapping(method = POST, value = "/sell")
    public Account sellAccount(@RequestBody AccountDataDTO acc) {
        Account a = new Account(acc.platform, acc.login, acc.password, acc.owner);
        a = accountRepository.save(a);
        return a;
    }

    public static class AccountDataDTO {
        Platform platform;
        String login;
        String password;
        User owner;

        public AccountDataDTO() {}

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

}
