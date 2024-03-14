class Base {
    void area(int a, int b) {
        int squareArea = a * a;
        System.out.println("Area of the square: " + squareArea);
    }
}
class Derived extends Base {
    @Override
    void area(int a, int b) {
        int rectangleArea = a * b;
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
public class AreaOfSquareAndRectangle {
    public static void main(String[] args) {
        Base base = new Base();
        base.area(6, 8);
        Derived derived = new Derived();
        derived.area(4, 7);

        }
    }
