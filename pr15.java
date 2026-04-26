import java.util.*;

class Employee
{
    String name;
    String department;

    Employee(String n, String d)
    {
        name = n;
        department = d;
    }

    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee
{
    int teamSize;
    String project;

    Manager(String n, String d, int t, String p)
    {
        super(n, d);
        teamSize = t;
        project = p;
    }

    void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class pr15
{
    public static void main(String args[])
    {
        Employee e = new Employee("Hetvi", "IT");
        Manager m = new Manager("Riya", "HR", 5, "Recruitment");

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println();

        System.out.println("Manager Details:");
        m.displayDetails();
    }
}

/*
Output:

Employee Details:
Name: Hetvi
Department: IT

Manager Details:
Name: Riya
Department: HR
Team Size: 5
Project: Recruitment
*/
