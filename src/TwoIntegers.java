import java.util.Scanner;

public class TwoIntegers {
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

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
