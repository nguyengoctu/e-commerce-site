package com.ntu.ecommerce.service;

import com.ntu.ecommerce.dao.CategoryDAO;
import com.ntu.ecommerce.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<Category> getAllCategories() {
        return categoryDAO.getAllCategories();
    }
}
