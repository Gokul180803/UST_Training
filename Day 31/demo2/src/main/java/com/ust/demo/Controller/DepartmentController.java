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

import com.ust.demo.Entity.Department;
import com.ust.demo.Service.AllService;



@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
   private AllService as;

   @PostMapping
   public Department create(@RequestBody Department department){
    return as.createDepartment(department);
   }
   @GetMapping
   public List<Department> read(){
    return as.readDepartment();
   }
   @GetMapping("/{id}")
public Optional<Department> readId(@PathVariable Long id){
    return as.readIdbyDepartment(id);
}
@PutMapping("/{id}")
public Department updatebyid(@PathVariable Long id,@RequestBody Department department){
    return as.updateDepartment(department);
}
@DeleteMapping("/{id}")
public String deleteDepartment(@PathVariable Long id){
    as.deleteIdbyDepartment(id);
    return "deleted the department";
}
}

