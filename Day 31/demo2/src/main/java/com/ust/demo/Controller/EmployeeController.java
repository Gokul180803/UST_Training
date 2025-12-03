package com.ust.demo.Controller;

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

import com.ust.demo.Entity.Employee;
import com.ust.demo.Service.AllService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
   private AllService ar;

   @PostMapping
   public Employee create(@RequestBody Employee employee){
    return ar.createEmployee(employee);
   }
   @GetMapping
   public List<Employee> read(){
    return ar.readEmployee();
   }
   @GetMapping("/{id}")
public Optional<Employee> readId(@PathVariable Long id){
    return ar.readIdbyEmployee(id);
}
@PutMapping("/{id}")
public Employee updatebyid(@PathVariable Long id,@RequestBody Employee employee){
    return ar.updateEmployee(employee);
}
@DeleteMapping("/{id}")
public String deleteEmployee(@PathVariable Long id){
    ar.deleteIdbyEmployee(id);
    return "deleted the employee";
}
}
