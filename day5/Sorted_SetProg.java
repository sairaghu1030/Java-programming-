import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_SetProg {
    public static void main(String[] args)
    {
        SortedSet<String> N= new TreeSet<String>();
        N.add("Chaitanya");
        N.add("Sai");
        N.add("Raghu");
        System.out.println(N);
        N.remove("Sai");
        System.out.println(N);

    }
}