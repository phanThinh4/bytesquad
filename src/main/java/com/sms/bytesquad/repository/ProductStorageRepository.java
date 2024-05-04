package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.ProductStorage;

public interface ProductStorageRepository extends JpaRepository<ProductStorage, Integer> {
}

