import java.util.*;

public class pr7
{
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name:");
        employeeName = sc.nextLine();

        System.out.println("Enter employee salary:");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData()
    {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String args[])
    {
        pr7 e1 = new pr7();

        e1.readEmployeeData();
        e1.displayEmployeeData();
    }
}

/*
Output:

Enter employee name:
Hetvi
Enter employee salary:
25000
Employee Name: Hetvi
Employee Salary: 25000.0
*/
