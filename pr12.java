import java.util.*;

public class pr12
{
    double calculateVolume(double side)
    {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h)
    {
        return l * w * h;
    }

    double calculateVolume(float r)
    {
        return (4.0/3.0) * Math.PI * r * r * r;
    }

    public static void main(String args[])
    {
        pr12 obj = new pr12();

        System.out.println("Cube Volume = " + obj.calculateVolume(3));
        System.out.println("Rectangular Cube Volume = " + obj.calculateVolume(4, 5, 6));
        System.out.println("Sphere Volume = " + obj.calculateVolume(2.5f));
    }
}

/*
Output:

Cube Volume = 27.0
Rectangular Cube Volume = 120.0
Sphere Volume = 65.44984694978736
*/
