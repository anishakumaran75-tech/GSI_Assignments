package dailyassignments;

public class Prog13_EmployeeDetailsManagement {
	public static void main(String[] args) {
		 Employee emp1 = new Employee("Unknown", 0, "Not Assigned");
	     Employee emp2 = new Employee("Priya", 101, "HR");
	     Employee emp3 = new Employee("Rahul", 102); 
	        
	     System.out.println("Employee 1: " + emp1.getName() + ", " + emp1.getId() + ", " + emp1.getDepartment());
	     System.out.println("Employee 2: " + emp2.getName() + ", " + emp2.getId() + ", " + emp2.getDepartment());
	     System.out.println("Employee 3: " + emp3.getName() + ", " + emp3.getId() + ", " + emp3.getDepartment());

	     emp1.setName("Anjali");
	     emp1.setId(103);
	     emp1.setDepartment("Finance");   
	     
	     System.out.println("Updated Employee 1: " + emp1.getName() + ", " + emp1.getId() + ", " + emp1.getDepartment());

	}
	
}
