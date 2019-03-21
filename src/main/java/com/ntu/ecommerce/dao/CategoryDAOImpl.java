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
        category.setId(0);
        categories.add(category);

        Category category1 = new Category();
        category1.setName("PS4");
        category1.setId(1);
        categories.add(category1);

        Category category2 = new Category();
        category2.setName("Nintendo Switch");
        category2.setId(2);
        categories.add(category2);
    }

    @Override
    public List<Category> getAllCategories() {
//        Session session = sessionFactory.getCurrentSession();
//        return session.createQuery("from Category", Category.class).getResultList();
        return categories;
    }

    @Override
    public Category getCategory(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(Category.class, id);
        return categories.get(id);
    }
}
