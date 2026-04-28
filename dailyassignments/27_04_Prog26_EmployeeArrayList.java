package dailyassignments;

import java.util.*;

class EmployeeDetails {
    int id;
    String name;
    double salary;
    String department;

    EmployeeDetails(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String toString() {
        return id + " " + name + " " + salary + " " + department;
    }
}

public class Prog26_EmployeeArrayList {
    public static void main(String[] args) {
    	//27_04_2026_Assignment

        ArrayList<EmployeeDetails> list = new ArrayList<>();

        // Add 6 employees
        list.add(new EmployeeDetails(101, "Anu", 45000, "HR"));
        list.add(new EmployeeDetails(102, "Ravi", 60000, "IT"));
        list.add(new EmployeeDetails(103, "Priya", 55000, "Finance"));
        list.add(new EmployeeDetails(104, "Kiran", 70000, "IT"));
        list.add(new EmployeeDetails(105, "Meena", 48000, "Sales"));
        list.add(new EmployeeDetails(106, "Arun", 52000, "IT"));

        // 1. Salary > 50000
        System.out.println("Employees with salary > 50000:");
        for (EmployeeDetails e : list) {
            if (e.salary > 50000) {
                System.out.println(e);
            }
        }

        // 2. Sort by salary ascending
        Collections.sort(list, (a, b) -> Double.compare(a.salary, b.salary));

        System.out.println("\nSorted by Salary:");
        for (EmployeeDetails e : list) {
            System.out.println(e);
        }

        // 3. Filter IT department
        System.out.println("\nIT Department Employees:");
        for (EmployeeDetails e : list) {
            if (e.department.equalsIgnoreCase("IT")) {
                System.out.println(e);
            }
        }

        // 4. Highest paid employee
        EmployeeDetails max = list.get(0);

        for (EmployeeDetails e : list) {
            if (e.salary > max.salary) {
                max = e;
            }
        }

        System.out.println("\nHighest Paid Employee:");
        System.out.println(max);

        // 5. Remove employee by ID
        int removeId = 103;

        Iterator<EmployeeDetails> it = list.iterator();

        while (it.hasNext()) {
            EmployeeDetails e = it.next();
            if (e.id == removeId) {
                it.remove();
            }
        }

        System.out.println("\nAfter Removing ID 103:");
        for (EmployeeDetails e : list) {
            System.out.println(e);
        }

        // 6. Increase salary by 10%
        for (EmployeeDetails e : list) {
            e.salary = e.salary + (e.salary * 0.10);
        }

        System.out.println("\nAfter 10% Salary Hike:");
        for (EmployeeDetails e : list) {
            System.out.println(e);
        }
    }
}
