package com.springboot.crudoperation.service;

import com.springboot.crudoperation.dto.OrderDetails;
import com.springboot.crudoperation.entity.Order;

public interface OrderService {

    OrderDetails saveOrder(OrderDetails orderDetails);

}
