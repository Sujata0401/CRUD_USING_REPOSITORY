package com.springboot.crudoperation.controller;

import com.springboot.crudoperation.entity.Unit;
import com.springboot.crudoperation.service.UnitService;
import com.springboot.crudoperation.service.UnitServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(value="/api")
public class UnitController {
    @Autowired
    UnitService unitService;
    @PostMapping("/save")
    public Unit saveUnit(@RequestBody Unit unit){
        return unitService.saveUnit(unit);
    }
    @PutMapping("/update")
    public Unit updateUnit(@RequestBody Unit unit){
        return unitService.saveUnit(unit);
    }
    @GetMapping("/getunit/{id}")
    public Unit getUnitById(@PathVariable("id") Integer unitId){
        return unitService.getUnitById(unitId);
    }

}
