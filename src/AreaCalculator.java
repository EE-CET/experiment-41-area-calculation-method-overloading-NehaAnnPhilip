import java.util.Scanner;

public class AreaCalculator {
    
    // TODO: Define calculateArea(float radius) -> returns area of circle
    public double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    // TODO: Define calculateArea(float length, float breadth) -> returns area of rectangle
    public double calculateArea(float length, float breadth) {
        return length * breadth;
    }

    // TODO: Define calculateArea(double base, double height) -> returns area of triangle
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator ac = new AreaCalculator();

        // TODO: Read input for Circle (radius)
        float radius = sc.nextFloat();

        // TODO: Read input for Rectangle (length, breadth)
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();

        // TODO: Read input for Triangle (base, height)
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        // TODO: Call methods and print results formatted to 2 decimal places
        System.out.printf("%.2f\n", ac.calculateArea(radius));
        System.out.printf("%.2f\n", ac.calculateArea(length, breadth));
        System.out.printf("%.2f\n", ac.calculateArea(base, height));

        sc.close();
    }
}
