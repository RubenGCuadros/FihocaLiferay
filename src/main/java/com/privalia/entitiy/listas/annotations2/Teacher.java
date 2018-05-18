package com.privalia.entitiy.listas.annotations2;

import org.springframework.beans.factory.annotation.Autowired;


public class Teacher {
	
	private int idTeacher;
	private String name;
	
	
	public Teacher () {	
		
	}
	
	
	public Teacher(int idTeacher, String name) {
		super();
		this.idTeacher = idTeacher;
		this.name = name;
	}


	public int getIdTeacher() {
		return idTeacher;
	}

	@Autowired
	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}


	public String getName() {
		return name;
	}

	@Autowired
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return (new StringBuilder())
				.append("[#")
				.append(this.idTeacher)
				.append(", ")
				.append(this.name)
				.append("]")
				.toString();
	}
	

}
