package com.springboot.crudoperation.dto;

import java.io.Serializable;

public class ProductDetails implements Serializable {

    private Integer productRate;
    private String productName;
    private String unitName;

    public Integer getProductRate() {
        return productRate;
    }

    public void setProductRate(Integer productRate) {
        this.productRate = productRate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public ProductDetails(Integer productRate, String productName, String unitName) {
        this.productRate = productRate;
        this.productName = productName;
        this.unitName = unitName;
    }
    public ProductDetails(){

    }
}
