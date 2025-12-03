package com.ust.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.Entity.Department;
import com.ust.demo.Entity.Employee;
import com.ust.demo.Repository.DepartmentRepository;
import com.ust.demo.Repository.EmployeeRepository;

@Service
public class AllService {
    @Autowired
    private DepartmentRepository dr;
    @Autowired
    private EmployeeRepository er;

public Employee createEmployee(Employee employee){
    return er.save(employee);
}
public Department createDepartment(Department department){
    return dr.save(department);
}


public List<Employee> readEmployee(){
    return er.findAll();
}
public List<Department> readDepartment(){
    return dr.findAll();
}
public Optional<Employee> readIdbyEmployee(Long id){
    return er.findById(id);
}
public Optional<Department> readIdbyDepartment(Long id){
    return dr.findById(id);
}
public Employee updateEmployee(Employee employee ){
    return er.save(employee);
}
public Department updateDepartment(Department department ){
    return dr.save(department);
}
public void deleteIdbyEmployee(Long id){
    er.deleteById(id);

}


public void deleteIdbyDepartment(Long id){
    dr.deleteById(id);

}






}
