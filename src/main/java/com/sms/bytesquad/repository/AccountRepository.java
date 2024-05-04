package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
}

