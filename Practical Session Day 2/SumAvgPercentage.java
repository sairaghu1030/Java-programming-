// Interface for sum
interface Summable {
    int sum(int[] numbers);
}
// Interface for average
interface Averagable {
    double avg(int[] numbers);
}
// Interface for percentage
interface PercentageCalculable {
    double percentage(double obtained, double total);
}
class Calculation implements Summable, Averagable, PercentageCalculable {
    @Override
    public int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    @Override
    public double avg(int[] numbers) {
        return (double) sum(numbers) / numbers.length;
    }
    @Override
    public double percentage(double obtained, double total) {
        return (obtained / total) * 100.0;
    }
}
public class SumAvgPercentage {
    public static void main(String[] args) {

        int[] numbers = {90, 85, 70, 80, 95};

        Calculation calculation = new Calculation();

        int sum = calculation.sum(numbers);
        double avg = calculation.avg(numbers);
        double percentage = calculation.percentage(350, 500);
// Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Percentage: " + percentage + "%");
    }
}