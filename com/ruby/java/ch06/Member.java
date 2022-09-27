package com.ruby.java.ch06;

public class Member {
//	private String name;
//	private int age;

	public Member() {
		this("guest");
	}

	public Member(String name) {
		this(name, 0);
	}

	public Member(String name, int age) {
//		this.name = name;
//		this.age = age;
	}

	public static void main(String[] args) {
		new Member();

	}
}
