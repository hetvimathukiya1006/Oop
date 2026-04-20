import java.util.*;

public class pr4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double weight_pound, height_inch;
        double weight_kg, height_meter, bmi;

        System.out.println("Enter weight in pounds:");
        weight_pound = sc.nextDouble();

        System.out.println("Enter height in inches:");
        height_inch = sc.nextDouble();

        weight_kg = weight_pound * 0.45359237;
        height_meter = height_inch * 0.0254;

        bmi = weight_kg / (height_meter * height_meter);

        System.out.println("BMI = " + bmi);
    }
}

/*
Output:

Enter weight in pounds:
150
Enter height in inches:
65
BMI = 24.961030646

*/
