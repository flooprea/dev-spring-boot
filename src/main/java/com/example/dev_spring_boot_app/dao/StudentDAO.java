package com.example.dev_spring_boot_app.dao;

import com.example.dev_spring_boot_app.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);
    Student findById(int id);

    List<Student> findAll();
    List<Student> findByLastName(String lastName);
}
