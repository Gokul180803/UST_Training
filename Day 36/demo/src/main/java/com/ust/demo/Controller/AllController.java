package com.ust.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.Service.AllService;
import com.ust.demo.entity.Department;
import com.ust.demo.entity.Employee;

@RestController
@RequestMapping("/details")
public class AllController {
    @Autowired
    private AllService as;
    
@PostMapping("/employeeCreate")
    public Employee createEmployee(@RequestBody Employee employee){
        return as.createEmployee(employee);
    }
@PostMapping("/DepartmentCreate")
    public Department createDepartment(@RequestBody Department department){
        return as.createDepartment(department);
    }
    @GetMapping("/employeeDetails")
    public List<Employee> readEmployee(){
        return as.readEmployee();
    }
    @GetMapping("/departmentDetails")
    public List<Department> readDepartment(){
        return as.readDepartment();
    }
    @GetMapping("/employeeDetails/{id}")
    public Optional<Employee> findbyIdEmployee(@PathVariable Integer id){
         Optional<Employee>op=as.findbyIdEmployee(id);
         if(op.isPresent()){
            return  as.findbyIdEmployee(id);
         }
         return null;
    }
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Integer id){
         as.deleteEmployee(id);
          return "deleted employee";


    }
    

}
