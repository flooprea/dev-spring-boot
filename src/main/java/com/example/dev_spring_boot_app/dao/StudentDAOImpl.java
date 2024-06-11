package com.example.dev_spring_boot_app.dao;

import com.example.dev_spring_boot_app.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        entityManager.persist(theStudent);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class ,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student", Student.class
        );
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student WHERE lastName=:theData", Student.class
        );
        query.setParameter("theData", lastName);
        return query.getResultList();
    }

    @Override
    public List<Student> findByLastNameOrEmail(String lastName, String email) {
        TypedQuery<Student> query = entityManager.createQuery(
                "FROM Student WHERE lastName=:lastName OR email =:email", Student.class
        );
        query.setParameter("lastName", lastName);
        query.setParameter("email", email);
        return query.getResultList();
    }
}
