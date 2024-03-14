public class StringAndEqualsMethod {
    private String name;
    private int age;
    // Constructor
    public StringAndEqualsMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Override toString() method
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    // Override equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StringAndEqualsMethod person = (StringAndEqualsMethod) obj;
        return age == person.age && name.equals(person.name);
    }
    public static void main(String[] args) {
// Creating two Person objects
        StringAndEqualsMethod person1 = new StringAndEqualsMethod("John", 20);
        StringAndEqualsMethod person2 = new StringAndEqualsMethod("John", 20);
// Using toString() method
        System.out.println("person1: " + person1.toString());
        System.out.println("person2: " + person2.toString());
// Using equals() method
        System.out.println("Are persons equal? " + person1.equals(person2));
    }
}