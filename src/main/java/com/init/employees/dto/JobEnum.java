package com.init.employees.dto;

public enum JobEnum {

	JEFE(3000), TRABAJADOR(1000);

	private int salary;

	//  constructor
	JobEnum(int s) {
		salary = s;
	}

	// Metodo Get
	int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
