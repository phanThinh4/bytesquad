package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
}

