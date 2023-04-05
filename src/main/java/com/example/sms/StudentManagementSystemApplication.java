package com.example.sms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository ;
	@Override
	public void run(String... args) throws Exception {
	    // check if the database is empty
        System.out.println("run method called");

	    if (studentRepository.count() == 0) {

	        // create and save students to the database
	    	
	        /*Student student1 = new Student("Ilyass", "Bouch", "ilyass@example.fr");
	        studentRepository.save(student1);
	        Student student2 = new Student("Yuyu", "Hami", "yuyu@example.com");
	        studentRepository.save(student2);
	        Student student3 = new Student("Harald", "Hansen", "harald@example.no");
	        studentRepository.save(student3);*/
	    }
	}

}
