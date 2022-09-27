package com.ruby.java.ch06;

class Person {
	private String name;
	private int age;
	private String dept;
	public Person() {
		
	}
	public Person(String s, int a, String d) {
		name = s; age = a; dept = d;
		System.out.println("person()::");
	}
	
}

public class Employee extends Person{
	private int salary;
	
	public Employee(String s, int a, String d, int pay) {
		super(s, a, d);
		System.out.println("Employee()::");
		salary = pay;
	} 
	
	public Employee(int pay) {
		salary = pay;
	}


	public static void main(String[] args) {
		Person p = new Person();
		Employee e = new Employee("hong", 10, "ce", 1000 );

	}

}
