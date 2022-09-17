package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Emp;

public interface EmployeeService {
	void insertEmployee(Emp e);
	void deleteEmployee(int eno);
	List<Emp> getEmployees();
	Emp getEmployee(int eno);
	void updateEmployee(int eno,Emp e);
}
