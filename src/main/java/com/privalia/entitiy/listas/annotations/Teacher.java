package com.privalia.entitiy.listas.annotations;




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


	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}


	public String getName() {
		return name;
	}


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
