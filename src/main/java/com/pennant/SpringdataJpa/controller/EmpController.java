package com.pennant.SpringdataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pennant.SpringdataJpa.dto.PennantEmployee;
import com.pennant.SpringdataJpa.service.IPennantEmployeeMngmtService;

@Component
public class EmpController {

	@Autowired
	private static IPennantEmployeeMngmtService ser;

	public static void main(String[] args) {
		PennantEmployee emp = new PennantEmployee();
		emp.setEmpname("Vysyaraju hemanth raju");
		emp.setRole("ASE");
		emp.setYoj(2024);
		String status = ser.registerEmployee(emp);
		System.out.println(status);
	}
}
