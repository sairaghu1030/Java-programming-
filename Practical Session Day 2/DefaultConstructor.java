class MyClass {
    int a;
    int b;

    // Default constructor
    MyClass() {
        this.a = 20;
        this.b = 25;
    }

    // Parameterized constructor
    MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public void displayCount() {
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {

        MyClass obj1 = new MyClass();
        obj1.disp();

        MyClass obj2 = new MyClass(50, 45);
        obj2.disp();
    }
}