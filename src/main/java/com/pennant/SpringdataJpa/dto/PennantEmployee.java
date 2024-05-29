package com.pennant.SpringdataJpa.dto;

import java.io.Serializable;

public class PennantEmployee implements Serializable {
	private static final long serialVersionUID = -3646645855677276960L;
	private Integer empid;
	private String empname;
	private String role;
	private Integer yoj;

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getYoj() {
		return yoj;
	}

	public void setYoj(Integer yoj) {
		this.yoj = yoj;
	}

	@Override
	public String toString() {
		return "PennantEmployee [empid=" + empid + ", empname=" + empname + ", role=" + role + ", yoj=" + yoj + "]";
	}

	public PennantEmployee() {
		super();
	}
}
