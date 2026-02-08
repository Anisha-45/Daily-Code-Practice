import java.util.Scanner;
public class Anisha_PrimeNumberRecursion {
    static boolean isPrime(int n, int i) {
        if (n <= 1)
            return false;
        if (i > n / 2)
            return true;
        if (n % i == 0)
            return false;
        return isPrime(n, i + 1);
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isPrime(n, 2))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
