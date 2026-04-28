package dailyassignments;

class Student{
	private int rollNo; 
	protected String name ;
	public String course ;
	
	void setStudentDetails(int rollNo, String name, String course)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	void displayStudentDetails() 
	{
		System.out.println("Student Details:");
		System.out.println("Roll No: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
	}
class Address{
	private String city;
	String state;
	void setAddress(String city, String state) 
	{
		this.city=city;
		this.state=state;
	}
	void displayAddress() 
	{
		System.out.println("Address Details:");
		System.out.println("City: "+city);
		System.out.println("State: "+state);
	}
}
class College
{
	private String collegeName;
	void setCollege(String collegeName)
	{
		this.collegeName=collegeName;
	}
	void displayCollege() 
	{
		System.out.println("College Details:");
		System.out.println("College Name: "+collegeName);
	}
	
}

}
public class Prog19_CollegeStudent {
	public static void main(String[] args) {
		//15_04_2026_Assignment
		Student stud=new Student();
		stud.setStudentDetails(101, "Priyanka", "B.tech");
		stud.displayStudentDetails();
		
		System.out.println();
		
		Student.Address addr = stud.new Address();
		addr.setAddress("Delhi", "Delhi");
		addr.displayAddress();
		
		System.out.println();
		
		Student.College col = stud.new College();
		col.setCollege("ABC College");
		col.displayCollege();
		
	}

}
