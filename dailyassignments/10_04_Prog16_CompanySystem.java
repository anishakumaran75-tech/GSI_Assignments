package dailyassignments;
//10_04_2026_AssignmentOnKeyword

class Company{
	final String companyName = "TCS";
	String location;
	Company(String location)
	{
		this.location=location;
	}
}
class Employee1 extends Company{
	int empId;
	String name;
	

	Employee1(String location,int empId,String name) {
		super(location);
		this.empId=empId;
		this.name=name;
		
	}
	
}
public class Prog16_CompanySystem {
public static void main(String[] args) {
	Employee1 emp=new Employee1("Chennai",101,"Mohan");
	
	System.out.println("Employee ID :"+emp.empId);
	System.out.println("Employee Name :"+emp.name);
	System.out.println("Employee Location :"+emp.location);
	System.out.println("Employee Company :"+emp.companyName);
}
}
