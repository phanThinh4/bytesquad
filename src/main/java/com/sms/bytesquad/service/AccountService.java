package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Account;

public interface AccountService {
    List<Account> getAllAccounts();

    Account getAccountByUsername(String username);

    void createAccount(Account account);
    
    void updateAccount(Account account);
    
    void deleteAccount(String username);
    
    boolean accountExists(String username);

}
