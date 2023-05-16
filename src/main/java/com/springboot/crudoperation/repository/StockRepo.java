package com.springboot.crudoperation.repository;

import com.springboot.crudoperation.entity.Stock;
import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<Stock, Integer> {


}
