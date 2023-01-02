package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		super();
		System.out.println("Employee 생성자 실행!");
		
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.setDept(dept);
		System.out.println("Employee 생성자 실행!");
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString() + " : " + dept;
	}

}
