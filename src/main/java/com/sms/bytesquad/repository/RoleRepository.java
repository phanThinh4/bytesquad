package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Role;

public interface RoleRepository extends JpaRepository<Role, String> {
}

