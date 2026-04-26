import java.util.*;

public class pr32
{
    static <T> boolean searchElement(LinkedList<T> list, T key)
    {
        return list.contains(key);
    }

    public static void main(String args[])
    {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(1); nums.add(2); nums.add(3);

        LinkedList<String> names = new LinkedList<>();
        names.add("Hetvi"); names.add("Riya");

        System.out.println(searchElement(nums, 2));
        System.out.println(searchElement(names, "Raj"));
    }
}

/*
Output:
true
false
*/
