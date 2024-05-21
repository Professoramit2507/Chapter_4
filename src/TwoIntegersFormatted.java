import java.util.Scanner;

public class TwoIntegersFormatted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();

        int sum = first + second;
        int difference = first - second;
        int product = first * second;
        double average = (first + second) / 2.0;
        int distance = Math.abs(first - second);
        int maximum = Math.max(first, second);
        int minimum = Math.min(first, second);

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Difference: %d%n", difference);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Distance: %d%n", distance);
        System.out.printf("Maximum: %d%n", maximum);
        System.out.printf("Minimum: %d%n", minimum);
    }
}
