package com.ust.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.demo.entity.Department;
import com.ust.demo.repository.departmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private departmentRepository ep;
    

    public Department create(Department department){
        return ep.save(department);
    }

    public List<Department> read(){
        return ep.findAll();
    }
    public Optional<Department> read(Long did){
        return ep.findById(did);
    }
    public Department update(Long did,Department department){
     Optional<Department>op= ep.findById(did);
     if(op.isPresent()){
        return ep.save(department);
     }
     return null;
    }
    public String delete(Long did){
        ep.deleteById(did);
        return "deleted";
    }


}
