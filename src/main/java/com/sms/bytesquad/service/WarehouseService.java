package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Warehouse;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses();

    Warehouse getWarehouseById(Integer id);

}
