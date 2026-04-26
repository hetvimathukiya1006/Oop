import java.util.*;

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amt)
    {
        balance = balance + amt;
    }

    void withdraw(double amt)
    {
        if(balance >= amt)
        {
            balance = balance - amt;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance()
    {
        System.out.println("Balance = " + balance);
    }
}

class SavingAccount extends BankAccount
{
    void calculateInterest()
    {
        double interest = balance * 0.04;
        System.out.println("Saving Account Interest = " + interest);
    }
}

class FixedDepositAccount extends BankAccount
{
    void maturityAmount(int years)
    {
        double rate = 0.06;
        double amount = balance * Math.pow(1 + rate, years);
        System.out.println("Maturity Amount = " + amount);
    }
}

public class pr14
{
    public static void main(String args[])
    {
        SavingAccount s = new SavingAccount();
        s.openAccount(101, "Hetvi", 10000);
        s.deposit(2000);
        s.withdraw(1500);
        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(102, "Riya", 20000);
        f.deposit(3000);
        f.checkBalance();
        f.maturityAmount(2);
    }
}

/*
Output:

Balance = 10500.0
Saving Account Interest = 420.0

Balance = 23000.0
Maturity Amount = 25848.8
*/
