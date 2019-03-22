package com.ntu.ecommerce.service;

import com.ntu.ecommerce.dao.CategoryDAO;
import com.ntu.ecommerce.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    private CategoryDAO categoryDAO;

    @Autowired
    public CategoryServiceImpl(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryDAO.getAllCategories();
    }

    @Override
    public List<Category> getAllEnabledCategories() {
        return categoryDAO.getEnabledCategories();
    }

    @Override
    public Category getCategory(int id) {
        return categoryDAO.getCategory(id);
    }

    @Override
    public void saveCategory(Category category) {
        categoryDAO.saveCategory(category);
    }

    @Override
    public void deleteCategory(Category category) {
        categoryDAO.delete(category);
    }
}
