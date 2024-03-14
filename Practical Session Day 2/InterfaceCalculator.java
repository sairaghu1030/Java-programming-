// Interface
interface Calculator {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    double div(int a, int b);
}
// Implementing class
class BasicCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    @Override
    public int sub(int a, int b) {
        return a - b;
    }
    @Override
    public int mul(int a, int b) {
        return a * b;
    }
    @Override
    public double div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
public class InterfaceCalculator {
    public static void main(String[] args) {
        BasicCalculator calculator = new BasicCalculator();
        int sum = calculator.add(17, 45);
        int difference = calculator.sub(50, 23);
        int product = calculator.mul(5, 7);
        double quotient = calculator.div(15, 3);
// Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}