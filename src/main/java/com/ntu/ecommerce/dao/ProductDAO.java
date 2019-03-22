package com.ntu.ecommerce.dao;

import com.ntu.ecommerce.entity.Category;
import com.ntu.ecommerce.entity.Product;

import java.util.List;

public interface ProductDAO {
    Product getProduct(int id);
    List<Product> getAllProducts();
    void saveProduct(Product product);
    void deleteProduct(Product product);

    List<Product> getEnabledProducts();
    List<Product> getEnabledProductsByCategory(Category category);
    List<Product> getEnabledProductsByCategory(int categoryId);
}
