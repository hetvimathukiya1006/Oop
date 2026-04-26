public class pr23
{
    public static void main(String args[])
    {
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=10; i++)
            {
                System.out.println(i);
                try { Thread.sleep(1000); } catch(Exception e){}
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=11; i<=20; i++)
            {
                System.out.println(i);
                try { Thread.sleep(500); } catch(Exception e){}
            }
        });

        t1.start();
        t2.start();
    }
}

/*
Output:
1 11 12 2 13 14 ... (mixed order due to threading)
*/
