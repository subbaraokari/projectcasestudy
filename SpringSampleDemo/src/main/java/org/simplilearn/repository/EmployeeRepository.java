package org.simplilearn.repository;

import org.simplilearn.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Emp, Integer>{

}
