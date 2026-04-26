import java.util.*;

public class pr11
{
    String collegeName;

    pr11(String cname)
    {
        collegeName = cname;
    }

    class Admission
    {
        String studentName;
        String course;

        void accept()
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter student name:");
            studentName = sc.nextLine();

            System.out.println("Enter course:");
            course = sc.nextLine();
        }

        void show()
        {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String args[])
    {
        pr11 c1 = new pr11("ABC College");

        pr11.Admission a1 = c1.new Admission();

        a1.accept();
        a1.show();
    }
}

/*
Output:

Enter student name:
Hetvi
Enter course:
Computer Engineering
College Name: ABC College
Student Name: Hetvi
Course: Computer Engineering
*/
