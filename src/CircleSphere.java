import java.util.Scanner;

public class CircleSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        final double PI = Math.PI;

        // Circle calculations
        double areaCircle = PI * Math.pow(radius, 2);
        double circumference = 2 * PI * radius;

        // Sphere calculations
        double volumeSphere = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        double surfaceAreaSphere = 4 * PI * Math.pow(radius, 2);

        System.out.printf("Circle Area: %.2f%n", areaCircle);
        System.out.printf("Circle Circumference: %.2f%n", circumference);
        System.out.printf("Sphere Volume: %.2f%n", volumeSphere);
        System.out.printf("Sphere Surface Area: %.2f%n", surfaceAreaSphere);
    }
}
