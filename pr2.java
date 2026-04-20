import java.util.*;

class pr2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy, x, y;

        System.out.println("Enter a, b, c, d, e, f:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();

        D = (a*d) - (b*c);
        Dx = (e*d) - (b*f);
        Dy = (a*f) - (e*c);

        if(D == 0)
        {
            System.out.println("No solution");
        }
        else
        {
            x = Dx / D;
            y = Dy / D;

            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}

/*
Output:

Enter a, b, c, d, e, f:
2 3 1 2 8 5
x = 1.0
y = 2.0
*/
