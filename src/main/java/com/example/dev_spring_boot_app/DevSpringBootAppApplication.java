package com.example.dev_spring_boot_app;

import com.example.dev_spring_boot_app.dao.StudentDAO;
import com.example.dev_spring_boot_app.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevSpringBootAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			findAllByLastName(studentDAO, "Doe").forEach(System.out::println);
		};

	}

	private List<Student> findAllByLastName(StudentDAO studentDao, String lastName) {
		return studentDao.findByLastName(lastName);
	}
	private List<Student> findAllStudents(StudentDAO studentDao) {
		return studentDao.findAll();
	}

	private Student findStudentById(StudentDAO studentDAO) {
		Student myStudent =  studentDAO.findById(3);
		return myStudent;
	}

	private void createStudent(StudentDAO studentDAO) {

		Student student = new Student("John", "Doe", "dev@mail.com");

		studentDAO.save(student);

		System.out.println(student.toString());
	}

}
