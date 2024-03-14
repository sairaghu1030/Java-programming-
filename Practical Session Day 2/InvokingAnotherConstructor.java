public class InvokingAnotherConstructor {
    private int number;
    private String text;
    // Constructor with two parameters
    public InvokingAnotherConstructor(int number, String text) {
        this.number = number;
        this.text = text;
    }
    public InvokingAnotherConstructor(int number) {
        this(number, "Default Text");
    }
    public void displayValues() {
        System.out.println("Number: " + number);
        System.out.println("Text: " + text);
    }
    public static void main(String[] args) {
        InvokingAnotherConstructor obj1 = new InvokingAnotherConstructor(32, "Hello, World!");
        obj1.displayValues();
        InvokingAnotherConstructor obj2 = new InvokingAnotherConstructor(23);
        obj2.displayValues();
    }
}