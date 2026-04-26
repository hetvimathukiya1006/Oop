import java.util.*;

interface Classify
{
    String getDivision(double average);
}

public class pr16 implements Classify
{
    public String getDivision(double average)
    {
        if(average >= 60)
            return "First Division";
        else
            return "Other Division";
    }

    public static void main(String args[])
    {
        pr16 obj = new pr16();
        System.out.println(obj.getDivision(65));
    }
}

/*
Output:
First Division
*/
