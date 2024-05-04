package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.Warehouse;
import com.sms.bytesquad.repository.WarehouseRepository;
import com.sms.bytesquad.service.WarehouseService;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseRepository.findAll();
    }

    @Override
    public Warehouse getWarehouseById(Integer id) {
        return warehouseRepository.findById(id).orElse(null);
    }

}

