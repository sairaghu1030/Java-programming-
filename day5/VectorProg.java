import java.util.Vector;

public class VectorProg {

    public static void main(String[] args)
    {
        Vector<String> G=new Vector<>();
        G.add("N");
        G.add("C");
        G.add("S");
        //G.add(9,"We");
        System.out.println(G);
        G.remove("S");
        System.out.println(G);
    }
}