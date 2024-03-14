class MyCLAss {
    static int num;
    static {
        num = 10;
        System.out.println("Static block executed. num: " + num);
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}