import java.util.Stack;

public class StackProg {
    public static void main(String[] args)
    {
        Stack<String> J=new Stack<>();
        J.push("Chaitanya");
        J.push("Sai");
        J.push("Raghu");
        J.push("Chaitu");
        System.out.println(J);
        String narnedra = J.pop();
        System.out.println(J);
        J.remove(1);
        System.out.println(J);
    }
}
