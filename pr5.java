import java.util.*;

public class pr5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double a, b, c, s, area;

        System.out.println("Enter three sides of triangle:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if(a + b > c && a + c > b && b + c > a)
        {
            s = (a + b + c) / 2;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println("Area of triangle = " + area);
        }
        else
        {
            System.out.println("Invalid triangle");
        }
    }
}

/*
Output:

Enter three sides of triangle:
3 4 5
Area of triangle = 6.0

Enter three sides of triangle:
1 2 3
Invalid triangle
*/
