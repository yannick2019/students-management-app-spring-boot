package com.students_management.students_management_app;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.students_management.students_management_app.entity.Student;
//import com.students_management.students_management_app.repository.StudentRepository;

@SpringBootApplication
public class StudentsManagementAppApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		 SpringApplication.run(StudentsManagementAppApplication.class , args);
	}

	/* 
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Student student1 = new Student("Yannick", "Yanga", "cleps2012@gmail.com");
		studentRepository.save(student1);

		Student student2 = new Student("Iryna", "Yanga", "irinashinger2019@gmail.com");
		studentRepository.save(student2);

		Student student3 = new Student("Roman", "Zaichenko", "roman.belgium@gmail.com");
		studentRepository.save(student3);

	}
	*/

}
