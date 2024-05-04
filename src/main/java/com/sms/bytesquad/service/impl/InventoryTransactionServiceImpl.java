package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.InventoryTransaction;
import com.sms.bytesquad.repository.InventoryTransactionRepository;
import com.sms.bytesquad.service.InventoryTransactionService;

import java.util.List;

@Service
public class InventoryTransactionServiceImpl implements InventoryTransactionService {

    @Autowired
    private InventoryTransactionRepository inventoryTransactionRepository;

    @Override
    public List<InventoryTransaction> getAllInventoryTransactions() {
        return inventoryTransactionRepository.findAll();
    }

    @Override
    public InventoryTransaction getInventoryTransactionById(Integer id) {
        return inventoryTransactionRepository.findById(id).orElse(null);
    }

}

