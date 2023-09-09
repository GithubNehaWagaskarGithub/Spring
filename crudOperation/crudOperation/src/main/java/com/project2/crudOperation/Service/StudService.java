package com.project2.crudOperation.Service;

import com.project2.crudOperation.Model.Student;
import com.project2.crudOperation.Repository.StudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Set;

@Service
public class StudService {

    @Autowired
    private StudRepository repository;

    public void addData(Student s){
        repository.save(s);
    }
    //--------------------------------------------------------------
    public List<Student> displayData()
    {
        return repository.findAll();
    }
    //-------------------------------------------------------------
    public void updateData(Student s)
    {
        repository.save(s);
    }
    //-------------------------------------------------------------
    public void deleteData(int id)
    {
        repository.deleteById(id);
    }
    //-------------------------------------------------------------
    public Set<String> displayUniqueCities()
    {
        return null;
    }
}
