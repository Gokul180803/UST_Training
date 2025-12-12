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
import com.ust.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
  private  DepartmentService ds;
@PostMapping
public Department createDepartment(@RequestBody Department department){
      return ds.create(department);

}
@GetMapping
public List<Department> findDepartment(){
    return ds.read();
}
 
@GetMapping("/{id}")
public Optional<Department> findbyid(@PathVariable Long did){
return ds.read(did);
}
@PutMapping("/{id}")
public Department updateDepartment(@PathVariable Long did, @RequestBody Department department){
return ds.update(did, department);
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long did){
    ds.delete(did);

}






}
