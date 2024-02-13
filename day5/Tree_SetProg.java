import java.util.TreeSet;

public class Tree_SetProg {
    public static void main(String[] args)
    {
        TreeSet<String> K=new TreeSet<String>();
        K.add("Player");
        K.add("Of");
        K.add("The");
        K.add("Match");
        System.out.println(K);
        K.remove("Of");
        System.out.println(K);

    }
}