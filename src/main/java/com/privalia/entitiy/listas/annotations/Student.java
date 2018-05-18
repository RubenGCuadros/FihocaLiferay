package com.privalia.entitiy.listas.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

		private int idStudent;
		private String name;
		private String surname;
		private int age;
		private List<Teacher> listTeacher;
		
		
		public Student() {
			
		}
		
		public Student(int idStudent, String name, String surname, int age, List<Teacher> listTeacher) {
			super();
			this.idStudent = idStudent;
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.listTeacher = listTeacher;
		}
		
		

		public int getIdStudent() {
			return idStudent;
		}
		
		@Autowired
		@Value("1")
		public void setIdStudent(int idStudent) {
			this.idStudent = idStudent;
		}

		public String getName() {
			return name;
		}
		
		@Autowired
		@Value("Manolo")
		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}
		
		@Autowired
		@Value("Sanchez")
		public void setSurname(String surname) {
			this.surname = surname;
		}

		public int getAge() {
			return age;
		}
		
		@Autowired
		@Value("25")
		public void setAge(int age) {
			this.age = age;
		}

		public List<Teacher> getListTeacher() {
			return listTeacher;
		}
		
		@Autowired
		@Qualifier(value="teachers")
		public void setListTeacher(List<Teacher> listTeacher) {
			this.listTeacher = listTeacher;
		}

		@Override
		public String toString() {
			return (new StringBuilder())
			.append("Student [idStudent=")
			.append(idStudent)
			.append(", name=")
			.append(name)
			.append(", surname=")
			.append(surname)
			.append(", age=")
			.append(age)
			.append(", listTeacher=")
			.append(listTeacher)
			.append("]")
			 .toString();
		}
		
		
		
		

}
