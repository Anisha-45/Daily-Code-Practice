import java.util.Scanner;

public class Anisha_PrimeNumbersInInterval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.print("Prime numbers between " + start + " and " + end + " are: ");
        sc.close();

        for (int num = start; num <= end; num++) {

            if (num <= 1)
                continue;

            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
