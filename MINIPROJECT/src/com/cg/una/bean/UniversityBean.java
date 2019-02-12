package com.cg.una.bean;

public class UniversityBean 
{
	int id;//setId  setName setDob setHighqn setMarks  setEmail
	String name;//getId getName getDob getHighqn getMarks getEmail
	String dob; 
	String highqn;
	int marks;
	String email;
 
	

	public UniversityBean() {
		super();
	}

	public UniversityBean(int id, String name, String dob, String highqn, int marks, String email) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.highqn = highqn;
		this.marks = marks;
		this.email = email;
	}

	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
 
	public String getDob() {
		return dob;
	}
 
	public void setDob(String dob) {
		this.dob = dob;
	}
 
	public String getHighqn() {
		return highqn;
	}
 
	public void setHighqn(String highqn) {
		this.highqn = highqn;
	}
 
	public int getMarks() {
		return marks;
	}
 
	public void setMarks(int marks) {
		this.marks = marks;
	}
 
	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UniversityBean [id=" + id + ", name=" + name + ", dob=" + dob + ", highqn=" + highqn + ", marks="
				+ marks + ", email=" + email + "]";
	}
}
