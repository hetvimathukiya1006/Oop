public class pr20
{
    public static void main(String args[])
    {
        try
        {
            int num = Integer.parseInt(args[0]);
            int den = Integer.parseInt(args[1]);

            int res = num / den;
            System.out.println("Result = " + res);
        }
        catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}

/*
Run:
java pr20 10 2
Output:
Result = 5
*/
