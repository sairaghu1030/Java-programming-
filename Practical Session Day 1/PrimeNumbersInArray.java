public class PrimeNumbersInArray {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {7, 10, 17, 18, 23, 45, 49};

        int primeCount = 0;

        System.out.println("Array elements:");
        for (int num : array) {
            System.out.print(num + " ");
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println("\nNumber of prime numbers in the array: " + primeCount);
    }
}