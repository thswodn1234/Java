import java.util.ArrayList;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Employee("오정임", 47, "입학처"));

        list.add(new Professor("김푸름", 52, "빅데이터"));

        list.add(new Student("김유빈", 20, "컴퓨터과학"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

    }
}

class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("Person 생성자 실행!");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String toString() {
        return name + ":" + age;
        // return String.format("%s : %d", name, age);
    }
}

class Employee extends Person {
    private String dept;

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
        System.out.println("Employee(name, age, dept) 생성자 실행!");
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString() {
        return super.toString() + ":" + dept;
    }
}

class Professor extends Person {
    private String subject;

    public Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("Professor(name, age, subject) 생성자 실행!");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return super.toString() + ":" + subject;
    }

}

class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
        System.out.println("Student(name, age, major) 생성자 실행!");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + ":" + major;
    }
}
