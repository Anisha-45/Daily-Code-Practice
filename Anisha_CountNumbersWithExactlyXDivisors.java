import java.util.Scanner;
public class Anisha_CountNumbersWithExactlyXDivisors {
    static int countDivisors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        System.out.print("Enter X (number of divisors): ");
        int x = sc.nextInt();

        int totalNumbers = 0;

        System.out.println("\nNumbers having exactly " + x + " divisors are:");

        for (int num = start; num <= end; num++) {
            int divisors = countDivisors(num);

            if (divisors == x) {
                System.out.print(num + " ");
                totalNumbers++;
            }
        }

        System.out.println("\n\nTotal count = " + totalNumbers);

        sc.close();
    }
}

