package com.pennant.SpringdataJpa.service;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pennant.SpringdataJpa.dao.IPennantEmployeeCrudRepository;
import com.pennant.SpringdataJpa.dto.PennantEmployee;

@Service(value = "service")
public class PennantEmployeeMngmtServiceImpl implements IPennantEmployeeMngmtService {

	@Autowired
	private IPennantEmployeeCrudRepository repo;

	@Override
	public String registerEmployee(PennantEmployee emp) {
		com.pennant.SpringdataJpa.bo.PennantEmployee empbo = new com.pennant.SpringdataJpa.bo.PennantEmployee();
		BeanUtils.copyProperties(emp, empbo);
		com.pennant.SpringdataJpa.bo.PennantEmployee saved = repo.save(empbo);
		if (saved != null) {
			return "emp record saved with id" + saved.getEmpid();
		}
		return "sorry! record not saved";
	}

	@Override
	public Iterable<PennantEmployee> findall() {
		Iterable<com.pennant.SpringdataJpa.bo.PennantEmployee> findAll = repo.findAll();
		ArrayList<PennantEmployee> emplist = new ArrayList<>();
		findAll.forEach(e -> {
			PennantEmployee emp = new PennantEmployee();
			BeanUtils.copyProperties(e, emp);
			emplist.add(emp);

		});
		return emplist;
	}

}
