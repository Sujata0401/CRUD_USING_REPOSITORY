package com.springboot.crudoperation.service;

import com.springboot.crudoperation.entity.Unit;
import com.springboot.crudoperation.repository.UnitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitServiceImp implements UnitService {
    @Autowired
    UnitRepo unitRepo;
    @Override
    public Unit saveUnit(Unit unit) {
        return unitRepo.save(unit);
    }

    @Override
    public Unit getUnitById(Integer unitId) {
        return unitRepo.findById(unitId).orElse(null);
    }
}
