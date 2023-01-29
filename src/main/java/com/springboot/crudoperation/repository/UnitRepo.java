package com.springboot.crudoperation.repository;

import com.springboot.crudoperation.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepo extends JpaRepository<Unit,Integer> {
}
