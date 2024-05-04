package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.Authority;
import com.sms.bytesquad.repository.AuthorityRepository;
import com.sms.bytesquad.service.AuthorityService;

import java.util.List;

@Service
public class AuthorityServiceImpl implements AuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public List<Authority> getAllAuthorities() {
        return authorityRepository.findAll();
    }

    @Override
    public Authority getAuthorityById(Integer id) {
        return authorityRepository.findById(id).orElse(null);
    }
    
    @Override
    public Authority createAuthority(Authority authority) {
        return authorityRepository.save(authority);
    }

    @Override
    public void updateAuthority(Authority authority) {
        authorityRepository.save(authority);
    }

    @Override
    public void deleteAuthority(Integer id) {
        authorityRepository.deleteById(id);
    }
    
    @Override
    public boolean authorityExists(Integer id) {
        return authorityRepository.existsById(id);
    }
}


