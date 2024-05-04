package com.sms.bytesquad.controller.manage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.bytesquad.entity.Account;
import com.sms.bytesquad.service.AccountService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("rest/accounts")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        return ResponseEntity.ok(accountService.getAllAccounts());
    }

    @GetMapping("{username}")
    public ResponseEntity<Account> getOne(@PathVariable String username) {
        if (!accountService.accountExists(username)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(accountService.getAccountByUsername(username));
    }

    @PostMapping
    public ResponseEntity<Account> post(@RequestBody Account account) {
        if (accountService.accountExists(account.getUsername())) {
            return ResponseEntity.badRequest().build();
        }
        accountService.createAccount(account);
        return ResponseEntity.ok(account);
    }

    @PutMapping("{username}")
    public ResponseEntity<Account> put(@PathVariable String username, @RequestBody Account account) {
        if (!accountService.accountExists(username)) {
            return ResponseEntity.notFound().build();
        }
        accountService.updateAccount(account);
        return ResponseEntity.ok(account);
    }

    @DeleteMapping("{username}")
    public ResponseEntity<Void> delete(@PathVariable String username) {
        if (!accountService.accountExists(username)) {
            return ResponseEntity.notFound().build();
        }
        accountService.deleteAccount(username);
        return ResponseEntity.ok().build();
    }

}
