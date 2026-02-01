import java.util.Scanner;

public class Anisha_AddTwoFractions {

    // Method to find HCF (GCD)
    static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to find LCM
    static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first fraction
        System.out.print("Enter numerator of first fraction: ");
        int n1 = sc.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int d1 = sc.nextInt();

        // Input second fraction
        System.out.print("Enter numerator of second fraction: ");
        int n2 = sc.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int d2 = sc.nextInt();

        // Find LCM of denominators
        int lcm = findLCM(d1, d2);

        // Convert fractions and add
        int sumNumerator = (n1 * (lcm / d1)) + (n2 * (lcm / d2));
        int sumDenominator = lcm;

        // Simplify the fraction
        int hcf = findHCF(sumNumerator, sumDenominator);
        sumNumerator /= hcf;
        sumDenominator /= hcf;

        // Output result
        System.out.println("Sum of fractions = " + sumNumerator + "/" + sumDenominator);

        sc.close();
    }
}
