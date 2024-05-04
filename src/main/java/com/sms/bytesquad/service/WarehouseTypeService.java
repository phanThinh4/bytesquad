package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.WarehouseType;

public interface WarehouseTypeService {
    List<WarehouseType> getAllWarehouseTypes();

    WarehouseType getWarehouseTypeById(Integer id);

}
