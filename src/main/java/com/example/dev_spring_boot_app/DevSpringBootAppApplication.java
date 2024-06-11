package com.example.dev_spring_boot_app;

import com.example.dev_spring_boot_app.dao.StudentDAO;
import com.example.dev_spring_boot_app.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DevSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevSpringBootAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
 		};
	}

	private void createStudent(StudentDAO studentDAO) {

		Student student = new Student("Devin", "TheDude", "dev@mail.com");

		studentDAO.save(student);

		System.out.println(student.toString());
	}

}
