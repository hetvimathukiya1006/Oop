class Table
{
    synchronized void printTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}

public class pr25
{
    public static void main(String args[])
    {
        Table obj=new Table();

        Thread t1=new Thread(() -> obj.printTable(5));
        Thread t2=new Thread(() -> obj.printTable(7));

        t1.start();
        t2.start();
    }
}

/*
Output:
(One table prints completely, then other)

5
10
15
...
50

7
14
21
...
70
*/
