package com.springboot.crudoperation.service;

import com.springboot.crudoperation.dto.ProductDetails;
import com.springboot.crudoperation.entity.Product;

public interface ProductService {
    Product saveProduct(Product product);
    Product updateProduct(Product product);

    ProductDetails getProductDetails(Integer productId);

}
