package com.azure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
