public class IfStatementContainsGreatestValue {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 17;
        int num3 = 30;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest value is in the first if statement: " + num1);
            } else {
                System.out.println("The greatest value is in the third if statement: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The greatest value is in the second if statement: " + num2);
            } else {
                System.out.println("The greatest value is in the third if statement: " + num3);
            }
        }
    }
}