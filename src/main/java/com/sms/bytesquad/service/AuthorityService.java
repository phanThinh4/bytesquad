package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Authority;

public interface AuthorityService {
    List<Authority> getAllAuthorities();

    Authority getAuthorityById(Integer id);
    
    Authority createAuthority(Authority authority);
    
    void updateAuthority(Authority authority);
    
    void deleteAuthority(Integer id);
    
    boolean authorityExists(Integer id);
}
