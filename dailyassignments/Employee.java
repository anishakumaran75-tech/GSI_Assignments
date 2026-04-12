package dailyassignments;

public class Employee {
	private String name;
	private int id;
	private String department;
	
	Employee(String n,int i,String dept)
	{
		name=n;
		id=i;
		department=dept;
		
	}
	Employee(String name1, int id1)
	{
        name = name1;
        id = id1;
        department = "General";
    }
	
	public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
	
	


