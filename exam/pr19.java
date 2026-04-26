package exam;

import student.Student;

public class pr19 extends Student
{
    int m1, m2, m3;

    public pr19(int r, String n, int a, int b, int c)
    {
        super(r, n);
        m1 = a;
        m2 = b;
        m3 = c;
    }

    void displayResult()
    {
        displayStudent();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String args[])
    {
        pr19 obj = new pr19(1, "Hetvi", 80, 70, 90);
        obj.displayResult();
    }
}

/*
Output:

Roll No: 1
Name: Hetvi
Marks: 80, 70, 90
Total: 240
Average: 80.0
*/
