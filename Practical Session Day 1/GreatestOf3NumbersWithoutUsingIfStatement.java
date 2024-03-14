public class GreatestOf3NumbersWithoutUsingIfStatement {
    public static void main(String[] args) {
        int num1 = 07;
        int num2 = 45;
        int num3 = 18;

        int greatest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ?
                num2 : num3);

        System.out.println("The greatest number is: " + greatest);
    }
}