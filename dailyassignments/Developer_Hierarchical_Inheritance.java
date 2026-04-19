package dailyassignments;

public class Developer_Hierarchical_Inheritance extends BaseEmployee
{
	String programmingLanguage;
	
	Developer_Hierarchical_Inheritance(String Emp_name, double Emp_salary,String prog_Lang) {
		super(Emp_name, Emp_salary);
		programmingLanguage=prog_Lang;
		
	}
	void displayDetails() 
	{
		System.out.println("Employee Name : "+name+"\nEmployee Salary :"+salary);
		System.out.println("Programming Language :"+programmingLanguage);
	}

	
}
