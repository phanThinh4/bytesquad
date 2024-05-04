package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}

