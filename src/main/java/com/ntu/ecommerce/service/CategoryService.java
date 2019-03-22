package com.ntu.ecommerce.service;

import com.ntu.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    List<Category> getAllEnabledCategories();
    Category getCategory(int id);
    void saveCategory(Category category);
    void deleteCategory(Category category);
}
