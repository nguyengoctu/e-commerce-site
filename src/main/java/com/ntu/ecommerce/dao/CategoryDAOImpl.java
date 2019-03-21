package com.ntu.ecommerce.dao;

import com.ntu.ecommerce.entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryDAOImpl implements CategoryDAO{
    @Autowired
    private SessionFactory sessionFactory;

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category = new Category();
        category.setName("XBox");
        categories.add(category);

        Category category1 = new Category();
        category1.setName("PS4");
        categories.add(category1);

        Category category2 = new Category();
        category2.setName("Nintendo Switch");
        categories.add(category2);
    }

    @Override
    public List<Category> getAllCategories() {
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery("from Category", Category.class).getResultList();
        return categories;
    }
}
