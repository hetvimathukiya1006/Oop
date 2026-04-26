import java.io.*;

public class pr28
{
    public static void main(String args[])
    {
        int lines=0, words=0, chars=0;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while((line=br.readLine())!=null)
            {
                lines++;
                words += line.split("\\s+").length;
                chars += line.replaceAll(" ", "").length();
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

/*
Output (example):
Lines: 3
Words: 10
Characters: 45
*/
