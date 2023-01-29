package com.springboot.crudoperation.service;

import com.springboot.crudoperation.dto.ProductDetails;
import com.springboot.crudoperation.entity.Product;
import com.springboot.crudoperation.entity.Unit;
import com.springboot.crudoperation.repository.ProductRepo;
import com.springboot.crudoperation.repository.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
    @Autowired
    ProductRepo productRepo;
    @Autowired
    UnitRepo unitRepo;

    @Override
    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product pro = productRepo.findById(product.getProductId()).orElse(null);
        pro.setProductName(product.getProductName());
        pro.setUnitId(product.getUnitId());
        return productRepo.save(pro);
    }

    @Override
    public ProductDetails getProductDetails(Integer productId) {
        ProductDetails productDetails = new ProductDetails();
        Product pro = productRepo.findById(productId).orElse(null);
        productDetails.setProductName(pro.getProductName());
        productDetails.setProductRate(pro.getProductRate());

        Unit unit=unitRepo.findById(pro.getUnitId()).orElse(null);
        productDetails.setUnitName(unit.getUnitName());
        return productDetails;
    }
}
