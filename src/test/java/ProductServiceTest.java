import com.ntu.ecommerce.entity.Product;
import com.ntu.ecommerce.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/e-commerce-config.xml"})
@Transactional
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void productServiceInjectionTest() {
        Assert.assertNotNull(productService);
    }

    @Test
    public void getExistedProductTest() {
        int id = 1;
        Product product = productService.getProduct(id);
        Assert.assertEquals("Expect to get iPhone 5s", "iPhone 5s", product.getName());
    }

    @Test
    public void getNonExistedProductTest() {
        int id = 14;
        Product product = productService.getProduct(id);
        Assert.assertNull("Expect to get iPhone 5s", product);
    }
}
