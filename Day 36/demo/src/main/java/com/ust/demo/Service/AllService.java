package com.ust.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.Repository.DepartmentRepository;
import com.ust.demo.Repository.EmployeeRepository;
import com.ust.demo.entity.Department;
import com.ust.demo.entity.Employee;

@Service
public class AllService {
@Autowired
private DepartmentRepository dr;
@Autowired
private EmployeeRepository er;



public Employee createEmployee(Employee employee){
    if(employee.getDepartment()!=null){
      for (Department department : employee.getDepartment()) {
            department.setEmployees(employee);
        }
    }
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
public Optional<Employee> findbyIdEmployee(Integer id){
      return er.findById(id);
}
public Optional<Department> findbyIdDepartment(Integer id){
    return dr.findById(id);
    
}

public Employee updateEmployee(Employee employee,Integer id){
   Optional<Employee> op=er.findById(id);
   if(op.isPresent()){
    return er.save(employee);
   }
   return null;

}
public Department updateDepartment(Department department,Integer id){
   Optional<Department> ep=dr.findById(id);
   if(ep.isPresent()){
    return dr.save(department);
   }
   return null;

}
public void  deleteEmployee(Integer id){
    er.deleteById(id);
   
}
public void deleteDepartment(Integer id){
    dr.deleteById(id);
  

}







}
