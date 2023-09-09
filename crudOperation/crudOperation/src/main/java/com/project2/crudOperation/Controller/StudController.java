package com.project2.crudOperation.Controller;

import com.project2.crudOperation.Model.Student;
import com.project2.crudOperation.Service.StudService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudController {
    @Autowired
    private StudService service;

    @PostMapping("/addData")
    public void addData(@RequestBody Student s)
    {
        service.addData(s);
    }
    //----------------------------------------------------------------
    @GetMapping("displayData")
    public List<Student> displayData()
    {
        return service.displayData();
    }
    //-----------------------------------------------------------------
    @PutMapping("/updateData")
    public void updateData(@RequestBody Student s)
    {
        service.updateData(s);
    }
    //----------------------------------------------------------------
    @DeleteMapping("/deleteData/{id}")
    public void deleteData(@PathVariable int id)
    {
        service.deleteData(id);
    }
    //------------------------------------------------------------------
}
