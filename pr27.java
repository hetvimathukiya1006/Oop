import java.io.*;

public class pr27
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw = new FileWriter("students.txt");
            fw.write("1 Hetvi 80\n2 Riya 75\n3 Raj 90");
            fw.close();

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while((line=br.readLine())!=null)
            {
                System.out.println(line);
            }

            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/*
Output:
1 Hetvi 80
2 Riya 75
3 Raj 90
*/
