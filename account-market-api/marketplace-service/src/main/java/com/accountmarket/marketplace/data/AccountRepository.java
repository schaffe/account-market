package com.accountmarket.marketplace.data;

import com.accountmarket.entities.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
