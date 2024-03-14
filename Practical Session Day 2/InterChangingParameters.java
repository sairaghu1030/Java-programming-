public class InterChangingParameters {
    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(double a, double b) {
        return (int)(a + b);
    }
    public static void main(String[] args) {
        var InterChangingParameters = new InterChangingParameters();
        int sum1 = InterChangingParameters.sum(4, 5);
        System.out.println("Sum of two integers: " + sum1);
        int sum2 = InterChangingParameters.sum(3.5, 2.5);
        System.out.println("Sum of two doubles: " + sum2);
    }
}