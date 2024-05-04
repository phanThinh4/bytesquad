package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.ProductStorage;

public interface ProductStorageService {
    List<ProductStorage> getAllProductStorages();

    ProductStorage getProductStorageById(Integer id);
    
}

