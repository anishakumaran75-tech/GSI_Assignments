package dailyassignments;

public class SeniorDeveloper_Multilevel extends Developer_Hierarchical_Inheritance 
{
	int years;
	
	SeniorDeveloper_Multilevel(String Emp_name, double Emp_salary,String prog_Lang,int experience) {
		super(Emp_name, Emp_salary, prog_Lang);
		years=experience;
		}
	void displayDetails() 
	{
		System.out.println("Employee Name : "+name+"\nEmployee Salary :"+salary);
		System.out.println("Experience :"+years);
	}
	
}
