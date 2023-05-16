package com.springboot.crudoperation.repository;

import com.springboot.crudoperation.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
