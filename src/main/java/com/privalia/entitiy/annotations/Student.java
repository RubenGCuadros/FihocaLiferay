package com.privalia.entitiy.annotations;

public class Student {

		private int idStudent;
		private String name;
		private String surname;
		private int age;
		private Address address;
		public int getIdStudent() {
			return idStudent;
		}
		public void setIdStudent(int idStudent) {
			this.idStudent = idStudent;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getSurname() {
			return surname;
		}
		public void setSurname(String surname) {
			this.surname = surname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Address getAddress() {
			return address;
		}
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
}
