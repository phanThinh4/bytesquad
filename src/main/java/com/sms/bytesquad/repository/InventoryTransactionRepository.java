package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.InventoryTransaction;

public interface InventoryTransactionRepository extends JpaRepository<InventoryTransaction, Integer> {
}

