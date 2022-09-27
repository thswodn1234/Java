package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest s = new StaticMethodTest();
		print1();
		s.print2();
	}
	
	public static void print1() {
		
		System.out.println("hello");
	}
	
	public void print2() {
		int num;
		num = this.num;
		System.out.println(num);
		System.out.println("java");
	}
}
