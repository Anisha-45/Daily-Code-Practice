import java.util.Scanner;

public class SumOfTwoPrimeNumbers {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        boolean found = false;

        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " = " + i + " + " + (number - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println(number + " cannot be expressed as a sum of two prime numbers");
        }
    }
}
