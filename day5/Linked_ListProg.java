import java.util.LinkedList;

public class Linked_ListProg {
    public static void main(String[] args)
    {
        LinkedList<String> L=new LinkedList<String>();
        L.add("ABC");
        L.add("DEF");
        L.add("GHI");
        System.out.println(L);
        L.remove("GHI");
        System.out.print(L);
    }
}
