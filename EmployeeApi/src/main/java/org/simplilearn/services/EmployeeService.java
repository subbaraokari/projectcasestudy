package org.simplilearn.services;

import java.util.List;

import org.simplilearn.entities.Emp;
import org.simplilearn.exceptions.EmployeeNotFoundException;
import org.simplilearn.model.EmpRegistrationModel;

public interface EmployeeService {
	void insertEmployee(EmpRegistrationModel emp);
	void deleteEmployee(int eno);
	List<Emp> getEmployees();
	Emp getEmployee(int eno) throws EmployeeNotFoundException;
	void updateEmployee(int eno,Emp e) throws EmployeeNotFoundException;
}
