
import java.util.Scanner;

public class Anisha_RootsOfQuadraticEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        // If a = 0, then it is not a quadratic equation
        if (a == 0) {
            System.out.println("Not a Quadratic Equation (because a = 0).");
            sc.close();
            return;
        }

        double D = (b * b) - (4 * a * c);

        System.out.println("\nDiscriminant (D) = " + D);

        if (D > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(D)) / (2 * a);
            double root2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Two Real Roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        }

        else if (D == 0) {
            // One real root
            double root = (-b) / (2 * a);

            System.out.println("One Real Root:");
            System.out.println("Root = " + root);
        }

        else {
            // No real roots (complex)
            double realPart = (-b) / (2 * a);
            double imaginaryPart = Math.sqrt(-D) / (2 * a);

            System.out.println("No Real Roots (Complex Roots):");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}
