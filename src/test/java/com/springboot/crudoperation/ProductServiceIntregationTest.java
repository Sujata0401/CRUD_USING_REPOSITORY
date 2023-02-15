package com.springboot.crudoperation;

import com.springboot.crudoperation.entity.Product;
import com.springboot.crudoperation.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Transactional
@SpringBootTest
public class ProductServiceIntregationTest {
    @Autowired
    ProductService productService;

    @Test
    public void saveProduct() throws Exception {
        Product pro = new Product( "Salt", 25);
        Product pro1= productService.saveProduct(pro);
        assertEquals(pro.getProductName(),pro1.getProductName());
    }
    @Test
    public void getProductById() throws Exception{
        Integer id=12;
        Product product=productService.getProductById(id);
        assertThat(product).isNotNull();
        assertThat(product.getProductName()).isEqualTo("orange");
        assertThat(product.getProductRate()).isEqualTo(100);
    }
}
