import java.util.*;

public class pr31
{
    public static void main(String args[])
    {
        LinkedList<String> list = new LinkedList<>();

        list.add("Song1");
        list.add("Song2");
        list.add("Song3");

        System.out.println("Playlist: " + list);

        list.removeFirst();
        System.out.println("After playing first: " + list);

        list.removeLast();
        System.out.println("After skipping last: " + list);
    }
}

/*
Output:
Playlist: [Song1, Song2, Song3]
After playing first: [Song2, Song3]
After skipping last: [Song2]
*/
