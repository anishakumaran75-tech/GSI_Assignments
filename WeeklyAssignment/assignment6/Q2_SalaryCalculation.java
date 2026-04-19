package assignment6;

class Employee{
	int empId;
	String name;
	double basicSalary;
	
	Employee(int empId,String name,double basicSalary){
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	double calculateSalary(double basicSalary) {
		double hra=0.20*basicSalary;
		double bonus=0.10*basicSalary;
		double totalSalary=basicSalary+hra+bonus;
		
		return totalSalary;
			
	}
	
	void display() {
		
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + name);
		System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Total Salary: " + calculateSalary(basicSalary));
		
	}
}

public class Q2_SalaryCalculation {
public static void main(String[] args) {
	

	Employee emp=new Employee(101,"Nisha",50000);
	emp.display();
}
}
