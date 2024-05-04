package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.Account;
import com.sms.bytesquad.repository.AccountRepository;
import com.sms.bytesquad.service.AccountService;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountByUsername(String username) {
        return accountRepository.findById(username).orElse(null);
    }
    
    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void deleteAccount(String username) {
        accountRepository.deleteById(username);
    }
    
    @Override
    public boolean accountExists(String username) {
        return accountRepository.existsById(username);
    }
}

