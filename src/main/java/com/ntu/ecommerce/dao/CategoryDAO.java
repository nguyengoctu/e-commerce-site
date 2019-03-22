package com.ntu.ecommerce.dao;

import com.ntu.ecommerce.entity.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAllCategories();
    List<Category> getEnabledCategories();
    Category getCategory(int id);
    void saveCategory(Category category);
    void delete(Category category);
}
