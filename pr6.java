import java.util.*;

public class pr6
{
    double width = 1;
    double height = 1;

    pr6()
    {
    }

    pr6(double w, double h)
    {
        width = w;
        height = h;
    }

    double getArea()
    {
        return width * height;
    }

    double getPerimeter()
    {
        return 2 * (width + height);
    }

    public static void main(String args[])
    {
        pr6 r1 = new pr6();
        pr6 r2 = new pr6(5, 3);

        System.out.println("Default Rectangle:");
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println("Custom Rectangle:");
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}

/*
Output:

Default Rectangle:
Area = 1.0
Perimeter = 4.0

Custom Rectangle:
Area = 15.0
Perimeter = 16.0
*/
