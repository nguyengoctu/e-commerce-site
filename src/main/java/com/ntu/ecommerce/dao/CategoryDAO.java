package com.ntu.ecommerce.dao;

import com.ntu.ecommerce.entity.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAllCategories();
}
