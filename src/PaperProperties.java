public class PaperProperties {
    public static void main(String[] args) {
        // Constants
        final double INCHES_TO_MM = 25.4;
        final double WIDTH_INCHES = 8.5;
        final double HEIGHT_INCHES = 11.0;

        // Convert to millimeters
        double widthMM = WIDTH_INCHES * INCHES_TO_MM;
        double heightMM = HEIGHT_INCHES * INCHES_TO_MM;

        // Calculate perimeter
        double perimeter = 2 * (widthMM + heightMM);

        // Calculate diagonal using Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(widthMM, 2) + Math.pow(heightMM, 2));

        // Print results
        System.out.println("Width in mm: " + widthMM);
        System.out.println("Height in mm: " + heightMM);
        System.out.println("Perimeter in mm: " + perimeter);
        System.out.println("Diagonal in mm: " + diagonal);
    }
}
