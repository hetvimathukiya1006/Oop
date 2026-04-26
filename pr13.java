import java.util.*;

class Shape
{
    double d1, d2;

    void getData(double a, double b)
    {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape
{
    void area()
    {
        double area = 0.5 * d1 * d2;
        System.out.println("Triangle Area = " + area);
    }
}

class Rectangle extends Shape
{
    void area()
    {
        double area = d1 * d2;
        System.out.println("Rectangle Area = " + area);
    }
}

public class pr13
{
    public static void main(String args[])
    {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

        t.getData(4, 5);
        t.area();

        r.getData(4, 5);
        r.area();
    }
}

/*
Output:

Triangle Area = 10.0
Rectangle Area = 20.0
*/
