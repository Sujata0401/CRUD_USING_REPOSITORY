package com.springboot.crudoperation.controller;

import com.springboot.crudoperation.dto.ProductDetails;
import com.springboot.crudoperation.entity.Product;
import com.springboot.crudoperation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping(value="/saveproduct")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

//    @PutMapping(value="/updateproduct")
//    public Product updateProduct(@RequestBody Product product){
//        return productService.updateProduct(product);
//    }
//    @GetMapping(value="/getproductdetails/{productId}")
//    public ProductDetails getProductDetails(@PathVariable("productId") Integer productId){
//        return productService.getProductDetails(productId);
//    }

    @GetMapping(value ="/getproduct")
    public List<Product> getproduct(){
        return productService.getproduct();
    }
    @GetMapping(value="/getproductbyid/{productId}")
    public Product getProductById(@PathVariable("productId") Integer productId){
        return productService.getProductById(productId);
    }

}
