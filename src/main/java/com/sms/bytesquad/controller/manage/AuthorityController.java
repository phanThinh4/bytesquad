package com.sms.bytesquad.controller.manage;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.bytesquad.entity.Authority;
import com.sms.bytesquad.service.AccountService;
import com.sms.bytesquad.service.AuthorityService;
import com.sms.bytesquad.service.RoleService;

@RestController
@RequestMapping("rest/authorities")
public class AuthorityController {
    @Autowired
    AuthorityService authorityService;

    @Autowired
    AccountService accountService;

    @Autowired
    RoleService roleService;

    @GetMapping
    public Map<String, Object> get() {
        Map<String, Object> data = new HashMap<>();
        data.put("authorities", authorityService.getAllAuthorities());
        data.put("roles", roleService.getAllRoles());
        data.put("accounts", accountService.getAllAccounts());
        return data;
    }

    @PostMapping
    public Authority create(@RequestBody Authority authority) {
        return authorityService.createAuthority(authority);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") int id) {
        authorityService.deleteAuthority(id);
    }
}
