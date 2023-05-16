package com.springboot.crudoperation.service;

import com.springboot.crudoperation.dto.OrderDetails;
import com.springboot.crudoperation.entity.Order;
import com.springboot.crudoperation.entity.Stock;
import com.springboot.crudoperation.repository.OrderRepo;
import com.springboot.crudoperation.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.SQLException;

@Service
public class OrderServiceImp implements OrderService {
    @Autowired
    OrderRepo orderRepo;
//    @Autowired
//    StockRepo stockRepo;
    @Autowired
    StockService stockService;

    @Override
  // @Transactional(rollbackOn = SQLException.class)
    public OrderDetails saveOrder(OrderDetails orderDetails){
        Order order = new Order();
        order.setProductId(orderDetails.getProductId());
        order.setOrderQuantity(orderDetails.getOrderQuantity());
        orderRepo.save(order);


        Stock stock = new Stock();
        stock.setPurchaseQuantity(orderDetails.getPurchaseQuantity());
        stock.setProductId(orderDetails.getProductId());
        stock.setOrderQuantity(orderDetails.getOrderQuantity());
        stockService.saveStock(stock);
        return orderDetails;


    }
}
