package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Product;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(Integer id);

}
