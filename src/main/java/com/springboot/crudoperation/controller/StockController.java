package com.springboot.crudoperation.controller;

import com.springboot.crudoperation.entity.Stock;
import com.springboot.crudoperation.repository.StockRepo;
import com.springboot.crudoperation.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class StockController {
    @Autowired
    StockService stockService;
    @PostMapping("/savestock")
    public Stock saveStock(@RequestBody Stock stock){
        return stockService.saveStock(stock);
    }
}
