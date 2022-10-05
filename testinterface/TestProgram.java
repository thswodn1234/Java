package testinterface;

interface Message {

	public abstract String getMessage();

	public abstract void setMessage(String msg);

	public static void getConnection() {
		System.out.println("network ok");
	}
}

abstract class Person {
		private String pnum;
		private String name;
		private int age;

		abstract void show(); // toString()를 호출하여 sysout으로 처리

		abstract void increase();// salary, scholarship, or dayPay를 10% 증가

		public Person() {
			pnum = "";
			name = "";
			age = 0;
		}

		public Person(String pnum, String name, int age) {
			this.pnum = pnum;
			this.name = name;
			this.age = age;
		}

		public String toString() {
			return pnum + " : " + name + " : " + age;

		}

}

class Employee extends Person implements Message {
		private String job;
		private String dept;
		private int salary;

		public Employee(String pnum, String name, int age, String job,
				String dept, int salary) {

			super(pnum, name, age);
			this.job = job;
			this.dept = dept;
			this.salary = salary;

		}

		@Override
		public void show() {
			System.out.println(super.toString() + " : " + job + " : " + dept
					+ " : " + salary);

		}

		@Override
		public void increase() {
			this.salary += 0.1 * salary;
		}

		public String getMessage() {
			return "Employee";
		}

		public void setMessage(String msg) {
			System.out.println("Emplyee에서 메시지를 설정합니다 : " + msg);
		}

}

class Designer extends Employee {
		private String language;
		private int workYear;

		public Designer(String pnum, String name, int age, String job,
				String dept, int salary, String language, int workYear) {
			super(pnum, name, age, job, dept, salary);

			this.language = language;
			this.workYear = workYear;
		}

		@Override
		public void show() {
			System.out.println(
					super.toString() + " : " + language + " : " + workYear);

		}

		@Override
		public void increase() {

			super.increase();
		}

		public String getMessage() {
			return "Designer";
		}



}

class Student extends Person {
		private String schoolName;
		private int schoolyear;
		private int scholarship;

		public Student(String pnum, String name, int age, String schoolName,
				int schoolyear, int scholarship) {
			super(pnum, name, age);
			this.schoolName = schoolName;
			this.schoolyear = schoolyear;
			this.scholarship = scholarship;

		}

		@Override
		public void show() {

			System.out.println(super.toString() + " : " + schoolName + " : "
					+ schoolyear + " : " + scholarship);

		}

		@Override
		void increase() {
			this.scholarship += 0.1 * scholarship;

		}

}

class WorkStudent extends Student {
		private String job;
		private int daypay;

		public WorkStudent(String pnum, String name, int age, String schoolName,
				int schoolyear, int scholarship, String job, int daypay) {
			super(pnum, name, age, schoolName, schoolyear, scholarship);
			this.job = job;
			this.daypay = daypay;

		}

		public void show() {
			System.out.println(super.toString() + " : " + job + " : " + daypay);
		}

		public void increase() {
			this.daypay += 0.1 * daypay;

		}

}

public class TestProgram {
		static void messageShowAll(Message[] m) {
			for (int i = 0; i < m.length; i++) {
			System.out.println(m[i].getMessage()); // 동적바인딩 구현
			}
		}
		static void showAll(Person[] p) {
			for (int i = 0; i < p.length; i++) {
				p[i].show(); // 동적바인딩 구현
			}
		}

		static void increaseAll(Person[] p) {
			for (int i = 0; i < p.length; i++) {
				p[i].increase(); // 동적바인딩 구현
			}
		}

		static void getData(Person[] p) {

			Employee e = new Employee("pnum1", "name1", 10, "job1", "dept1",
					10);
			Designer d = new Designer("pnum2", "name2", 20, "job2", "dept2", 20,
					"java", 20);
			Student s = new Student("pnum3", "name3", 30, "job3", 30, 30);
			WorkStudent w = new WorkStudent("pnum4", "name4", 40, "job4", 40,
					40, "s", 40);
			p[0] = e;
			p[1] = d;
			p[2] = s;
			p[3] = w;

		}

		public static void main(String[] args) {
//			Person[] setPerson = new Person[4];
//			TestProgram.getData(setPerson);
//			showAll(setPerson);
//			increaseAll(setPerson);
//			showAll(setPerson);
			
			Message m[] = new Message[2];
			m[0] = new Employee("pnum1", "name1", 10, "job1", "dept1",
					10);
			m[1] = new Designer("pnum2", "name2", 20, "job2", "dept2", 20,
					"java", 20);
			
			messageShowAll(m);
 		}
}

