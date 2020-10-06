package com.init.employees.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.init.employees.dao.IEmployeeDAO;
import com.init.employees.dto.Employee;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
	

	@Autowired
	IEmployeeDAO iemployeeDAO;

	@Override
	public List<Employee> listEmployees() {
	
		return iemployeeDAO.findAll();
	}
	
	/**
	 * En el siguiente metodo se obtiene la posición que tiene el cargo introducido,
	 * para asignarle el salario en función de ello
	 */
	@Override
	public Employee saveEmployee(@RequestBody Employee employee) {
		switch (employee.getJobenum().ordinal()) {
		case 1:
			employee.setSalary(3000);
		case 2:
			employee.setSalary(1000);
		}
		return iemployeeDAO.save(employee);
	}

	@Override
	public Employee employeeXID(Integer id) {
		return iemployeeDAO.findById(id).get();
	}

	@Override
	public ArrayList<Employee> employeePOSITIONALL() {

		return (ArrayList<Employee>) iemployeeDAO.findAll();
	}

	/**
	 * Al actualizar los datos de un empleado se obtiene la posición que tiene el
	 * cargo introducido, para asignarle el salario en función de ello
	 */
	@Override
	public Employee updateEmployee(@RequestBody Employee employee) {

		switch (employee.getJobenum().ordinal()) {
		case 1:
			employee.setSalary(3000);
		case 2:
			employee.setSalary(1000);
		}
		return iemployeeDAO.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {

		iemployeeDAO.deleteById(id);

	}

}
