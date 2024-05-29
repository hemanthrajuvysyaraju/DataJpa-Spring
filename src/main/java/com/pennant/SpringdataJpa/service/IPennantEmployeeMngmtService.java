package com.pennant.SpringdataJpa.service;

import com.pennant.SpringdataJpa.dto.PennantEmployee;

public interface IPennantEmployeeMngmtService {
	public String registerEmployee(PennantEmployee emp);

	public Iterable<PennantEmployee> findall();
}
