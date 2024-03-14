public class ChangeDataTypesPara {
    int sum(int a, int b) {
        return a + b;
    }
    double sum(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        var ChangeDataTypesPara = new ChangeDataTypesPara();
        System.out.println("Sum of 2 and 3: " + ChangeDataTypesPara.sum(2, 3));
        System.out.println("Sum of 2.5 and 3.5: " +ChangeDataTypesPara.sum(2.5, 3.5));
}
}