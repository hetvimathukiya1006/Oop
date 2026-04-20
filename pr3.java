import java.util.*;

public class pr3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("It is a vowel");
        }
        else
        {
            System.out.println("It is a consonant");
        }
    }
}

/*
Output:

Enter a character:
a
It is a vowel

Enter a character:
B
It is a consonant
*/
