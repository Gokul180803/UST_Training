package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.entity.Department;
import com.ust.demo.entity.Employee;
import com.ust.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
  private  EmployeeService ds;
@PostMapping("/emp")
public Employee createEmployee(@RequestBody Employee employee){
    
      return ds.create(employee);

}
  @PostMapping("/{id}/department")
  public Employee addEmployee( @PathVariable Long Id,@RequestBody Department department){
    return ds.addDepartment(Id, department);
}
@GetMapping
public List<Employee> findEmployee(){
    return ds.read();
}
 
@GetMapping("/{id}")
public Optional<Employee> findbyid(@PathVariable Long id){
return ds.read(id);
}
@PutMapping("/{id}")
public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
return ds.update(id, employee);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
    ds.delete(id);

}






}
