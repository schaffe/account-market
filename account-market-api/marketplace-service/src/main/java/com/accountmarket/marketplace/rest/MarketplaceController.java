package com.accountmarket.marketplace.rest;

import com.accountmarket.entities.Account;
import com.accountmarket.entities.Platform;
import com.accountmarket.entities.User;
import com.accountmarket.marketplace.data.AccountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static javafx.scene.input.KeyCode.T;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sell")
public class MarketplaceController {

    private final AccountRepository accountRepository;

    @Inject
    public MarketplaceController(AccountRepository accountRepository) {
        // inject service instead of repo
        this.accountRepository = accountRepository;

    }

//    @RequestMapping(method = GET)
//    public Account[] userAccountsForSale() {
//        String userId = "5a1584061693832d6084d45e";
////        do an HTTP call to the REST user controller
////        User u =
//        // use service instead of repo. Use List instead of array
//        //List<Account> accounts = accountRepository.findByUser();
//    }
//
    @RequestMapping(method = POST)
    public Account sellAccount(@RequestBody AccountDataDTO acc) {
        String userId = "5a1584061693832d6084d45e";
        Platform pl = Platform.getPlatformByName(acc.platform);

        Map<String,String> uriVariables = new Map<String,String>();

        uriVariables.put("id", userId);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> userResponse = restTemplate.getForEntity("/auth/getUserById", User.class, userId);

        User u = userResponse.getBody();

        Account a = new Account(pl, acc.login, acc.password, u);
        //use service
        a = accountRepository.save(a);
        return a;
    }

    public static class AccountDataDTO {
        String platform;
        String login;
        String password;
        String ownerId;

        public AccountDataDTO() {}

        public String getPlatform() {
            return platform;
        }

        public void setPlatform(String platform) {
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

        public String getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(String ownerId) {
            this.ownerId = ownerId;
        }
    }

}
