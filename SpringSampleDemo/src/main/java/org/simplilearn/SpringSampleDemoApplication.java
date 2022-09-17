package org.simplilearn;

import org.simplilearn.entities.Emp;
import org.simplilearn.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSampleDemoApplication {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner()
	{
		CommandLineRunner runner=(String ...s)->{
			Emp e1=new Emp();
			e1.setName("suresh");
			e1.setAddress("Chennai");
			Emp e2=new Emp();
			e2.setName("Raman");
			e2.setAddress("Hyderabad");
			Emp e3=new Emp();
			e3.setName("Arjun");
			e3.setAddress("Chennai");
			employeeRepository.save(e1);
			employeeRepository.save(e2);
			employeeRepository.save(e3);
		};
		return runner;
	}

}
