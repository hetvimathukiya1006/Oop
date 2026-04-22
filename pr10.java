import java.util.*;

public class pr10
{
    String account_holder_name;
    double balance;
    static double interest_rate;

    pr10(String name, double bal)
    {
        account_holder_name = name;
        balance = bal;
    }

    static void updateInterestRate(double rate)
    {
        interest_rate = rate;
    }

    void calculateInterest()
    {
        double interest = balance * interest_rate / 100;
        System.out.println("Interest for " + account_holder_name + " = " + interest);
    }

    void display()
    {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String args[])
    {
        pr10.updateInterestRate(5);

        pr10 b1 = new pr10("Hetvi", 10000);
        pr10 b2 = new pr10("Riya", 20000);

        b1.display();
        b1.calculateInterest();

        System.out.println();

        b2.display();
        b2.calculateInterest();
    }
}

/*
Output:

Name: Hetvi
Balance: 10000.0
Interest for Hetvi = 500.0

Name: Riya
Balance: 20000.0
Interest for Riya = 1000.0
*/
