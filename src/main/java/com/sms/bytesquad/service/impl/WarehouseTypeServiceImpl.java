package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.WarehouseType;
import com.sms.bytesquad.repository.WarehouseTypeRepository;
import com.sms.bytesquad.service.WarehouseTypeService;

import java.util.List;

@Service
public class WarehouseTypeServiceImpl implements WarehouseTypeService {

    @Autowired
    private WarehouseTypeRepository warehouseTypeRepository;

    @Override
    public List<WarehouseType> getAllWarehouseTypes() {
        return warehouseTypeRepository.findAll();
    }

    @Override
    public WarehouseType getWarehouseTypeById(Integer id) {
        return warehouseTypeRepository.findById(id).orElse(null);
    }

}

