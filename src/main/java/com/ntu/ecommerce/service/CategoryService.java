package com.ntu.ecommerce.service;

import com.ntu.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategory(int id);
}
