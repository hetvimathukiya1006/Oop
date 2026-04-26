import java.util.*;

public class pr30
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String str = sc.nextLine();

        String words[] = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();

        for(String w : words)
        {
            map.put(w, map.getOrDefault(w,0)+1);
        }

        for(String key : map.keySet())
        {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

/*
Input:
Java is fun and Java is powerful

Output:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1
*/
