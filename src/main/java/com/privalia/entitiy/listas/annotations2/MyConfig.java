package com.privalia.entitiy.listas.annotations2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
		
		@Bean(value ="student")
		public Student student(){
			Student student = new Student();
			student.setIdStudent(1);
			student.setName("Paco");
			student.setSurname("Sanchez");
			student.setAge(25);
			student.setListTeacher(teachers());
			return student;
		}
	
		@Bean(value = "teachers")
		public List<Teacher> teachers() {
			List<Teacher> teachers = new ArrayList<Teacher>();
			teachers.add(new Teacher(1, "Jordi"));
			teachers.add(new Teacher(2, "Pepe"));
			return teachers;
		}

}
