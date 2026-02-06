import java.util.Scanner;

public class Anisha_OccurrenceOfDigitInNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        System.out.print("Enter digit (0-9): ");
        int digit = sc.nextInt();

        int count = 0;

        long temp = Math.abs(num); // handle negative numbers

        if (digit < 0 || digit > 9) {
            System.out.println("Invalid digit! Enter between 0 to 9.");
            sc.close();
            return;
        }

        // Special case: if number is 0
        if (temp == 0 && digit == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                int lastDigit = (int) (temp % 10);

                if (lastDigit == digit) {
                    count++;
                }

                temp = temp / 10;
            }
        }

        System.out.println("Occurrence of digit " + digit + " = " + count);

        sc.close();
    }
}
