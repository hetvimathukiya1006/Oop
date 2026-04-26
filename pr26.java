import java.io.*;

public class pr26
{
    public static void main(String args[])
    {
        int chars=0, words=0, lines=0;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while((line=br.readLine())!=null)
            {
                lines++;
                chars += line.length();
                words += line.split("\\s+").length;
            }

            System.out.println("Lines = " + lines);
            System.out.println("Words = " + words);
            System.out.println("Characters = " + chars);

            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/*
Run:
java pr26 data.txt

Output (example):
Lines = 3
Words = 10
Characters = 50
*/
