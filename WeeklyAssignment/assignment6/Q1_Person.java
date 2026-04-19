package assignment6;

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
}

class Student extends Person{
	int marks;
Student(String name, int age,int marks) {
	super(name, age);

		this.marks=marks;
	}

	
	void display() {
		System.out.println("Student name : "+super.name);
		System.out.println("Student age : "+super.age);
		System.out.println("Student marks : "+this.marks);
	}
	
	
}

public class Q1_Person {
public static void main(String[] args) {
	Student S1=new Student("Praveen",21,89);
	S1.display();
}
}
