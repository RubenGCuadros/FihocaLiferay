package com.privalia.entitiy.listas.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

		@Bean(value = "teachers")
		public List<Teacher> teachers() {
			List<Teacher> teachers = new ArrayList<Teacher>();
			teachers.add(new Teacher(1, "Jodi"));
			teachers.add(new Teacher(2, "Pepe"));
			return teachers;
		}

}
