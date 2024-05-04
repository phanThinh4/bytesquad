package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Integer> {
}

