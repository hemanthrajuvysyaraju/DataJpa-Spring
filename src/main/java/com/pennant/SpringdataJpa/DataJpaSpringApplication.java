package com.pennant.SpringdataJpa;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.pennant.SpringdataJpa.dto.PennantEmployee;
import com.pennant.SpringdataJpa.service.IPennantEmployeeMngmtService;

@SpringBootApplication
public class DataJpaSpringApplication {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = SpringApplication.run(DataJpaSpringApplication.class, args);
		IPennantEmployeeMngmtService ser = context.getBean(IPennantEmployeeMngmtService.class);
		// PennantEmployee emp = new PennantEmployee();
		// emp.setEmpname("vysyaraju venkata hemanth raju ");
		// emp.setRole("Sr.Project manager");
		// emp.setYoj(2024);
		// String status = ser.registerEmployee(emp);
		// System.out.println(status);
		Iterable<PennantEmployee> findall = ser.findall();
		findall.forEach(System.out::println);
		((ConfigurableApplicationContext) context).close();
	}

}
