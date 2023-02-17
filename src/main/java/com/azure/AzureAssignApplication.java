package com.azure;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureAssignApplication {

	@Autowired
	private EmployeeRepository empRepo;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return this.empRepo.save(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return this.empRepo.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AzureAssignApplication.class, args);
	}

}
