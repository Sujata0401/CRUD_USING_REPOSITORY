package com.springboot.crudoperation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.crudoperation.controller.ProductController;
import com.springboot.crudoperation.entity.Product;
import com.springboot.crudoperation.entity.Unit;
import com.springboot.crudoperation.service.ProductService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    public void saveProduct() throws Exception {
        Product pro = new Product(1, "ghee", 2000);
        ObjectMapper objectMapper = new ObjectMapper();
        Mockito.when(productService.saveProduct(Mockito.any(Product.class))).thenReturn(pro);
        mockMvc.perform(MockMvcRequestBuilders.post("/saveproduct")
                        .content(objectMapper.writeValueAsString(pro))
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productName").value("ghee"));
    }

    @Test
    public void getProductById() throws Exception {
        Product pro = new Product(12, "orange", 200);
        Mockito.when(productService.getProductById(Mockito.anyInt())).thenReturn(pro);
        mockMvc.perform(MockMvcRequestBuilders.get("/getproductbyid/12")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.productName").value("orange"));

    }

    @Test
    public void getproduct() throws Exception {
        List<Product> pros = new ArrayList<>();
        Product pro = new Product();
        pro.setProductId(1);
        pro.setProductName("Apple");
        pro.setProductRate(340);
        Product pro1= new Product();
        pro1.setProductId(2);
        pro1.setProductName("Banana");
        pro1.setProductRate(240);
        List<Unit> units = new ArrayList<>();
        Unit unit = new Unit();
        unit.setUnitName("kg");
        unit.setUnitId(1);
        units.add(unit);
        Unit unit1 = new Unit();
        unit1.setUnitId(2);
        unit1.setUnitName("gram");
        units.add(unit1);
        pro.setUnit(units);
        pro1.setUnit(units);
        pros.add(pro);
        pros.add(pro1);
        Mockito.when(productService.getproduct()).thenReturn(pros);
        mockMvc.perform(MockMvcRequestBuilders.get("/getproduct")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()").value(2))
                .andExpect(jsonPath("$.[1].productName").value("Banana"));


    }
}
