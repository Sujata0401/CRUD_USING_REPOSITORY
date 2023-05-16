package com.springboot.crudoperation.service;

import com.springboot.crudoperation.entity.Stock;
import com.springboot.crudoperation.repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImp implements StockService{
    @Autowired
    StockRepo stockRepo;
    @Override
    public Stock saveStock(Stock stock) {
        return stockRepo.save(stock );
    }
}
