import java.util.*;

public class pr8
{
    double x, y;

    // Default constructor
    pr8()
    {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    pr8(double a, double b)
    {
        x = a;
        y = b;
    }

    // Copy constructor
    pr8(pr8 p)
    {
        x = p.x;
        y = p.y;
    }

    void display()
    {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String args[])
    {
        pr8 p1 = new pr8();
        pr8 p2 = new pr8(2, 3);
        pr8 p3 = new pr8(p2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Parameterized Constructor:");
        p2.display();

        System.out.println("Copy Constructor:");
        p3.display();
    }
}

/*
Output:

Default Constructor:
Point: (5.0, 5.0)

Parameterized Constructor:
Point: (2.0, 3.0)

Copy Constructor:
Point: (2.0, 3.0)
*/
