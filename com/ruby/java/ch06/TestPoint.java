package com.ruby.java.ch06;

class Point {

	private int x, y;

	public Point(int a, int b) {
		x = a;
		y = b;
	}

	public void show() {
		System.out.print("x = " + x + " , " + "y = " + y);
	}

}

class ColorPoint extends Point {

	private String color;

	public ColorPoint(int a, int b, String s) {
		super(a, b);
		color = s;
	}

	public void show() {

		System.out.println();
		super.show();
		System.out.println(", color = " + color);
	}

}

public class TestPoint {

	public static void main(String[] args) {

		Point p = new Point(10, 20);
		p.show();

		ColorPoint cp = new ColorPoint(10, 20, "red");
		cp.show();

	}

}
