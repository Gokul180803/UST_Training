package com.ust.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.demo.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{



}
