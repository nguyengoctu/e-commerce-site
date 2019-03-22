package com.ntu.ecommerce.dao;

import com.ntu.ecommerce.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
    private SessionFactory sessionFactory;

    @Autowired
    public CategoryDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Category> getAllCategories() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Category", Category.class).getResultList();
//        return categories;
    }

    @Override
    public List<Category> getEnabledCategories() {
        Session session = sessionFactory.getCurrentSession();
        Query<Category> query = session.createQuery("from Category where enabled=:enabled", Category.class);
        query.setParameter("enabled", true);
        return query.getResultList();
    }

    @Override
    public Category getCategory(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Category.class, id);
//        return categories.get(id);
    }

    @Override
    public void saveCategory(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(category);
    }

    @Override
    public void delete(Category category) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(category);
    }
}
