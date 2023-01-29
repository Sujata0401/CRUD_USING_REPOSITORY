package com.springboot.crudoperation.entity;

import javax.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name="product_id")
    private Integer productId;

    @Column(name="product_name",nullable = false)
    private String productName;
    @Column(name="product_rate",nullable = true)
    private Integer productRate;
    @Column(name="unit_id" ,nullable=false)
    private Integer unitId;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductRate() {
        return productRate;
    }

    public void setProductRate(Integer productRate) {
        this.productRate = productRate;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Product(Integer productId, String productName, Integer productRate, Integer unitId) {
        this.productId = productId;
        this.productName = productName;
        this.productRate = productRate;
        this.unitId = unitId;
    }
    public  Product(){

    }
}
