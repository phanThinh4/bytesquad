package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.InventoryTransaction;

public interface InventoryTransactionService {
    List<InventoryTransaction> getAllInventoryTransactions();

    InventoryTransaction getInventoryTransactionById(Integer id);
}
