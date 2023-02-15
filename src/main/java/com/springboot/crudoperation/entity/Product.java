package com.springboot.crudoperation.entity;

import org.apache.tomcat.jni.Address;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "product_rate")
    private Integer productRate;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinColumn(name = "pk_product_id", referencedColumnName = "product_id")
    private List<Unit> unit = new ArrayList<>();

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

    public List<Unit> getUnit() {
        return unit;
    }

    public void setUnit(List<Unit> unit) {
        this.unit = unit;
    }

//    public Product(Integer productId, String productName, Integer productRate, List<Unit> unit) {
//        this.productId = productId;
//        this.productName = productName;
//        this.productRate = productRate;
//        this.unit = unit;
//    }

    public Product() {
    }

    public Product(Integer productId, String productName, Integer productRate) {
        this.productId = productId;
        this.productName = productName;
        this.productRate = productRate;
    }

    public Product(String productName, Integer productRate) {
        this.productName = productName;
        this.productRate = productRate;
    }
}
