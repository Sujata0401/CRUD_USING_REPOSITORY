package com.springboot.crudoperation.entity;

import javax.persistence.*;

@Entity
@Table(name = "stock_table")
public class Stock {
    @Id
    @GeneratedValue
    private Integer stockId;
    @Column(nullable = false,name = "purchase_quantity",columnDefinition = "integer default 0")
    private Integer purchaseQuantity;
    @Column(nullable = false,name = "product_id")
    private Integer productId;
    @Column(nullable = false,name="order_qty",columnDefinition = "integer default 0")
   private  Integer orderQuantity;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Integer purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}
