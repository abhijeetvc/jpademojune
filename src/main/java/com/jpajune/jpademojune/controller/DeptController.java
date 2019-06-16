package com.jpajune.jpademojune.controller;


import com.jpajune.jpademojune.model.Department;
import com.jpajune.jpademojune.repository.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    private DeptRepo deptRepo;

    @PostMapping(value="/savedept")
    public String addDept(@RequestBody Department department){
        deptRepo.save(department);
        return "Dept saved";

    }
}
