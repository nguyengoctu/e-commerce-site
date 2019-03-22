import com.ntu.ecommerce.entity.Category;
import com.ntu.ecommerce.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/e-commerce-config.xml"})
@Transactional
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

//    @Test
    public void testCategoryServiceInject() {
        Assert.assertNotNull(categoryService);
    }

//    @Test
    public void addCategoryTest() {
        Category category = new Category();
        category.setName("PS3");
        categoryService.saveCategory(category);
        Category category1 = categoryService.getCategory(category.getId());
        Assert.assertEquals("Category names matched", category.getName(), category1.getName());
    }

    @Test
    public void getAllCategoriesTest() {
        List<Category> categories = categoryService.getAllCategories();
        Assert.assertEquals("Expect to get 6 items in categories list", 6, categories.size());
    }

    @Test
    public void getAllEnabledCategoriesTest() {
        List<Category> categories = categoryService.getAllEnabledCategories();
        Assert.assertEquals("Expect to get 3 items in categories list", 3, categories.size());

    }

    @Test
    public void deleteCategoryTest() {
        Category category = categoryService.getCategory(1);
        categoryService.deleteCategory(category);
        category = categoryService.getCategory(1);
        Assert.assertNull(category);
    }
}
