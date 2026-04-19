package dailyassignments;

public class Prog14_InheritanceEmployee {
public static void main(String[] args) {
	Manager_Single_Inheritance manager=new Manager_Single_Inheritance("Giri",70000,5000);
	Developer_Hierarchical_Inheritance developer=new Developer_Hierarchical_Inheritance("Mohan",50000,"JAVA");
	SeniorDeveloper_Multilevel seniorDeveloper =new SeniorDeveloper_Multilevel("Anisha",90000,"JAVA",5);
	
	manager.displayDetails();
	developer.displayDetails();
	seniorDeveloper.displayDetails();
	
	
}
}
