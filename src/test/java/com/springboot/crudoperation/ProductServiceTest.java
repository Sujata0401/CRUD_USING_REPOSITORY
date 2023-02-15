package com.springboot.crudoperation;

import com.springboot.crudoperation.entity.Product;
import com.springboot.crudoperation.repository.ProductRepo;
import com.springboot.crudoperation.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@WebMvcTest(ProductService.class)
public class ProductServiceTest {

    @MockBean
    ProductRepo productRepo;
    @Autowired
    ProductService productService;

    @Test
    public void saveProduct() throws Exception {
        Product pro = new Product("ghee", 2000);
        when(productRepo.save(any(Product.class))).thenReturn(pro);
        Product pro1 = productService.saveProduct(pro);
        assertEquals("ghee", pro1.getProductName());
    }

    @Test
    public void getproduct() throws Exception {
        //list garau hai suju cutie
        when(productRepo.findAll()).thenReturn(Stream.of(new Product(1, "orange", 100), new Product(2, "apple", 340)).collect(Collectors.toList()));
        List<Product> product = productService.getproduct();
        assertEquals("orange", product.get(0).getProductName());
    }

    @Test
    public void getproductById() throws Exception {
        Product pro = new Product(2, "mobile", 4000);
        when(productRepo.findById(pro.getProductId())).thenReturn(Optional.of(pro));
        Product product = (productService.getProductById(2));
        assertEquals(2, product.getProductId());
    }
}
