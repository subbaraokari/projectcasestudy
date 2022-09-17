package org.simplilearn.services;

import java.util.List;

import javax.transaction.Transactional;

import org.simplilearn.entities.Emp;
import org.simplilearn.exceptions.EmployeeNotFoundException;
import org.simplilearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void insertEmployee(Emp e) {
		employeeRepository.save(e);
	}

	@Override
	public void deleteEmployee(int eno) {
		employeeRepository.deleteById(eno);
	}

	@Override
	public List<Emp> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Emp getEmployee(int eno) {

		return employeeRepository.findById(eno).orElseThrow(()->new EmployeeNotFoundException("Employee Not Found"));
	}

	@Override
	public void updateEmployee(int eno, Emp e) {
		Emp e1=employeeRepository.findById(eno).orElseThrow(()->new EmployeeNotFoundException("Employee Not Found"));
		e1.setName(e.getName());
		e1.setAddress(e.getAddress());
		employeeRepository.save(e1);
	}

}
