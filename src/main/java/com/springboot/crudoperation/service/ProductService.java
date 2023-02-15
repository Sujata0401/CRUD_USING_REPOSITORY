package com.springboot.crudoperation.service;

import com.springboot.crudoperation.dto.ProductDetails;
import com.springboot.crudoperation.entity.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getproduct();

    Product getProductById(Integer productId);




//    Product updateProduct(Product product);
//
//    ProductDetails getProductDetails(Integer productId);

}
