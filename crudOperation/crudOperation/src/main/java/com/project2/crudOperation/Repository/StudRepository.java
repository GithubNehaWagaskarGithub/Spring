package com.project2.crudOperation.Repository;

import com.project2.crudOperation.Model.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends JpaRepository<Student,Integer>
{

}
