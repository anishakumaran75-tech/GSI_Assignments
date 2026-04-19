package dailyassignments;

public class BaseEmployee {
		String name;
		double salary;
		
		BaseEmployee(String Emp_name,double Emp_salary){
			name=Emp_name;
			salary=Emp_salary;
		}
		
		void displayDetails() 
		{
			System.out.println("Employee Name : "+name+"\nEmployee Salary :"+salary);
		}
}
