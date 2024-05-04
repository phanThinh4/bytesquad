package com.sms.bytesquad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.bytesquad.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}

