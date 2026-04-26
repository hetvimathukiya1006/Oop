import java.util.*;

interface Exam
{
    boolean isPassed(int mark);
}

interface Classify
{
    String getDivision(double average);
}

public class pr17 implements Exam, Classify
{
    public boolean isPassed(int mark)
    {
        return mark >= 40;
    }

    public String getDivision(double avg)
    {
        if(avg >= 60) return "First Division";
        else return "Second Division";
    }

    public static void main(String args[])
    {
        pr17 obj = new pr17();

        System.out.println("Passed: " + obj.isPassed(50));
        System.out.println("Division: " + obj.getDivision(65));
    }
}

/*
Output:
Passed: true
Division: First Division
*/
