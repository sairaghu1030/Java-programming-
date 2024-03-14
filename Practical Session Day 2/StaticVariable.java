class Myclass {
    // This is a static variable
    static int count = 0;
    Myclass() {
        // Increment the static variable for each new instance of MyClass
        count++;
    }
    void displayCount() {
        System.out.println("Number of instances created: " + count);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Myclass obj1 = new Myclass();
        obj1.displayCount(); // Output: Number of instances created: 1
        Myclass obj2 = new Myclass();
        obj2.displayCount(); // Output: Number of instances created: 2
    }
}