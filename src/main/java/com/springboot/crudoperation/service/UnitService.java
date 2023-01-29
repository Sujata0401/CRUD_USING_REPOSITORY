package com.springboot.crudoperation.service;

import com.springboot.crudoperation.entity.Unit;

public interface UnitService {

    Unit saveUnit(Unit unit);

    Unit getUnitById(Integer unitId);
}
