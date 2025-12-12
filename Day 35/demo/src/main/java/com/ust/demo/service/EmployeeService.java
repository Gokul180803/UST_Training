package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Department;
import com.ust.demo.entity.Employee;
import com.ust.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository ep;
    
    

    public Employee create(Employee employee){
       return ep.save(employee);
    }

    public List<Employee> read(){
        return ep.findAll();
    }
    public Optional<Employee> read(Long id){
        return ep.findById(id);
    }
    public Employee update(Long id,Employee employee){
     Optional<Employee>op= ep.findById(id);
     if(op.isPresent()){
        return ep.save(employee);
     }
     return null;
    }
    public String delete(Long id){
        ep.deleteById(id);
        return "deleted";
    }
public Employee addDepartment(Long id,Department department){
       Employee employee=ep.findById(id).orElse(null);
       if(employee!=null){
       department.setEmployee(employee);
        employee.getDepartment().add(department);
        return ep.save(employee);
       }
       return null;
}

}
