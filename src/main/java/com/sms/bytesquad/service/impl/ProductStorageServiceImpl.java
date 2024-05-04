package com.sms.bytesquad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.bytesquad.entity.ProductStorage;
import com.sms.bytesquad.repository.ProductStorageRepository;
import com.sms.bytesquad.service.ProductStorageService;

import java.util.List;

@Service
public class ProductStorageServiceImpl implements ProductStorageService {

    @Autowired
    private ProductStorageRepository productStorageRepository;

    @Override
    public List<ProductStorage> getAllProductStorages() {
        return productStorageRepository.findAll();
    }

    @Override
    public ProductStorage getProductStorageById(Integer id) {
        return productStorageRepository.findById(id).orElse(null);
    }

}

