package com.pennant.SpringdataJpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.pennant.SpringdataJpa.bo.PennantEmployee;

public interface IPennantEmployeeCrudRepository extends CrudRepository<PennantEmployee, Integer> {

}
