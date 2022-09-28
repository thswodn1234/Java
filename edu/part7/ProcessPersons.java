package edu.part7;

class Person {
	private String pno;
	private String pname;
	private int age;

	public Person() {
		System.out.println("default 생성자");
		pno = null;
		pname = null;
		age = 0;
	}

	public Person(String pn) {
		this();
		pno = pn;

	}

	public Person(String pn, String name) {
		this(pn);
		pname = name;

	}

	public Person(String pn, String name, int a) {

		this(pn, name);
		age = a;
	}

	public void show() {
		System.out.println("pno = " + pno + " pname = " + pname + " age = " + age);

	}

	public String toString() {
		return "pno = " + pno + "," + " pname = " + pname + "," + " age = " + age;
	}
}

class Student extends Person {

	private String schoolName;
	private int schoolYear;

	public Student() {

	}

	public Student(String pn, String name, int age) {
		super(pn, name, age);
	}

	public Student(String pn, String name, int age, String sn, int sy) {
		super(pn, name, age);
		schoolName = sn;
		schoolYear = sy;
	}

	public void show() {
		super.show();
		System.out.println("schoolName = " + schoolName + " schoolYear = " + schoolYear);
	}

	public String toString() {
		return super.toString() + "," + " schoolName = " + schoolName + "," + " schoolYear = " + schoolYear;
	}
}

class WorkStudent extends Student {

	private String job;
	private int salary;

	public WorkStudent() {
		job = null;
		salary = 0;
	}

	public WorkStudent(String pn, String name, int age, String sname, int syear, String j, int pay) {
		super(pn, name, age, sname, syear);
		job = j;
		salary = pay;
	}

	public void show() {
		super.show();
		System.out.println("job = " + job + " salary = " + salary);
	}

	public String toString() {
		return super.toString() + "," + " job = " + job + "," + " salary = " + salary;
	}
}

public class ProcessPersons {

	static void display(Person[] p) {
		for (int i = 0; i < p.length; i++) {
			p[i].show();
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Person[] list = new Person[6];

		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002", "Hong");

		Person p3 = new Person("p003", "Kim", 20);
		Student s1 = new Student("p004", "Lee", 40, "신라대", 5);
		WorkStudent ws = new WorkStudent("p001", "Hong", 30, "부산대", 3, "code", 1000);

		list[0] = p;
		list[1] = p1;
		list[2] = p2;
		list[3] = p3;
		list[4] = s1;
		list[5] = ws;

		display(list);
		
		System.out.println();

//		p3.show();
//		s1.show();
		ws.show();

		System.out.println();

		System.out.println(p3.toString());
		System.out.println(s1.toString());
		System.out.println(ws.toString());

	}

}
