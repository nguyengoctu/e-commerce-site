package com.ntu.ecommerce.service;

import com.ntu.ecommerce.dao.ProductDAO;
import com.ntu.ecommerce.entity.Category;
import com.ntu.ecommerce.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDAO productDAO;

    @Override
    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDAO.getAllProducts();
    }

    @Override
    public void saveProduct(Product product) {
        productDAO.saveProduct(product);
    }

    @Override
    public void deleteProduct(Product product) {
        productDAO.deleteProduct(product);
    }

    @Override
    public List<Product> getEnabledProducts() {
        return productDAO.getEnabledProducts();
    }

    @Override
    public List<Product> getEnabledProductsByCategory(Category category) {
        return getEnabledProductsByCategory(category.getId());
    }

    @Override
    public List<Product> getEnabledProductsByCategory(int categoryId) {
        return productDAO.getEnabledProductsByCategory(categoryId);
    }
}
