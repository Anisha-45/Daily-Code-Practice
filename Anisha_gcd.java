import java.util.Scanner;

public class Anisha_gcd {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        sc.close();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        int result = gcd(num1, num2);

        System.out.println("GCD = " + result);
    }
}
