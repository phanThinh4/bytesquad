package com.sms.bytesquad.service;

import java.util.List;

import com.sms.bytesquad.entity.Category;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(Integer id);
}
