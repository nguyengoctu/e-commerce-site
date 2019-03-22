package com.ntu.ecommerce.dao;

import com.ntu.ecommerce.entity.Category;
import com.ntu.ecommerce.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Product getProduct(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Product.class, id);
    }

    @Override
    public List<Product> getAllProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("from Product", Product.class);
        return query.getResultList();
    }

    @Override
    public void saveProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
    }

    @Override
    public void deleteProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(product);
    }

    @Override
    public List<Product> getEnabledProducts() {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("from Product where enabled=:enabled", Product.class);
        query.setParameter("enabled", true);
        return query.getResultList();
    }

    @Override
    public List<Product> getEnabledProductsByCategory(Category category) {
        return getEnabledProductsByCategory(category.getId());
    }

    @Override
    public List<Product> getEnabledProductsByCategory(int categoryId) {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("from Product where enabled=:enabled and category.id=:categoryId", Product.class);
        query.setParameter("enabled", true);
        query.setParameter("categoryId", categoryId);
        return query.getResultList();
    }
}
