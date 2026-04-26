import java.util.*;

public class pr29
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(70);
        list.add(85);
        list.add(60);
        list.add(90);
        list.add(75);

        System.out.println("Marks: " + list);
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}

/*
Output:
Marks: [70, 85, 60, 90, 75]
Max: 90
Min: 60
*/
