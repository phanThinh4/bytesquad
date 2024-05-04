package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

