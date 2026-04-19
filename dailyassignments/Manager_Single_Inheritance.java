package dailyassignments;

public class Manager_Single_Inheritance extends BaseEmployee {
		double bonus;
		
		Manager_Single_Inheritance(String Emp_name, double Emp_salary,double Emp_bonus) {
		super(Emp_name, Emp_salary);
		bonus=Emp_bonus;
		
	}
		
		void displayDetails() 
		{
			System.out.println("Employee Name : "+name+"\nEmployee Salary :"+salary);
			System.out.println("Bonus :"+bonus);
		}
		
		
		
}
