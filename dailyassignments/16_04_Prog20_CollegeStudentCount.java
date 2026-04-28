package dailyassignments;

class Student1
{
	private int rollNo ;
	protected String name ;
	public static String collegeName ;
	private static int studentCount ;
	static 
	{
		collegeName = "ABC College";
	    System.out.println("Static block executed");
	}
	Student1(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
		studentCount++;
	}
	public static void displayStudentCount() 
	{
		System.out.println("Total Students: "+studentCount);
	}
	void displayDetails() 
	{
		System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println();
	}

}
public class Prog20_CollegeStudentCount {
	public static void main(String[] args) {
		//16_04_2026_Assignment
		Student1 s1 = new Student1(1, "Priya");
        Student1 s2 = new Student1(2, "Rahul");

        s1.displayDetails();
        s2.displayDetails();

        Student1.displayStudentCount();
	}

}
