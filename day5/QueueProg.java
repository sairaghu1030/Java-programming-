import java.util.LinkedList;
import java.util.Queue;

public class QueueProg {
    public static void main(String[] args)
    {
        Queue<Integer> B= new LinkedList<Integer>();
        B.add(85);
        B.add(45);
        B.add(50);
        B.add(20);
        B.add(75);
        System.out.println(B);
        B.remove(50);
        System.out.println(B);
        Integer Front= B.remove();
        System.out.println(B);
        boolean Back=B.add(34);
        System.out.println(B);

    }
}