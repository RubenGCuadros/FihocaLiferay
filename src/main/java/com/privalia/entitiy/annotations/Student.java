package com.privalia.entitiy.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component(value = "student")
@PropertySource("classpath:config.properties")
public class Student {

		private int idStudent;
		private String name;
		private String surname;
		private int age;
		private Address address;
		
		public int getIdStudent() {
			return idStudent;
		}
		
		@Autowired
		@Value("${student.idstudent}")
		public void setIdStudent(int idStudent) {
			this.idStudent = idStudent;
		}
		public String getName() {
			return name;
		}
		
		@Autowired
		@Value("${student.name}")
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		
		@Autowired
		@Value("${student.surname}")
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public int getAge() {
			return age;
		}
		
		@Autowired
		@Value("${student.age}")
		public void setAge(int age) {
			this.age = age;
		}
		public Address getAddress() {
			return address;
		}
		
		@Autowired
		@Qualifier("address")
		public void setAddress(Address address) {
			this.address = address;
		}
		
		public Student(){
			
		}
		public Student(int idStudent, String name, String surname, int age, Address address) {
			super();
			this.idStudent = idStudent;
			this.name = name;
			this.surname = surname;
			this.age = age;
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [idStudent=" + idStudent + ", name=" + name + ", surname=" + surname + ", age=" + age
					+ ", address=" + address + "]";
		}
		
		@Bean
		public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
			return new PropertySourcesPlaceholderConfigurer();
		}
}
