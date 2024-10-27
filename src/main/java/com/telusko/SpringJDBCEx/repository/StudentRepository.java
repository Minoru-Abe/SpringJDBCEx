package com.telusko.SpringJDBCEx.repository;

import com.telusko.SpringJDBCEx.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    @Autowired
    private List<Student> students;


    public void save(Student student){
        students.add(student);
    }

    public List<Student> findAll() {
        return students;
    }




}
