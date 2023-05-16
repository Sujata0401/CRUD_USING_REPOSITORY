package com.springboot.crudoperation.controller;

import com.springboot.crudoperation.dto.OrderDetails;
import com.springboot.crudoperation.entity.Order;
import com.springboot.crudoperation.service.OrderService;
import com.springboot.crudoperation.service.OrderServiceImp;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping(value = "/api")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("/saveOrder")
    public OrderDetails SaveOrderOfProduct(@RequestBody OrderDetails orderDetails) {
        return orderService.saveOrder(orderDetails);
    }

}
