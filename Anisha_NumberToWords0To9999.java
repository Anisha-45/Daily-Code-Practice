import java.util.Scanner;

public class Anisha_NumberToWords0To9999 {

    // Function to convert 1 to 999 into words
    static String display(int num) {

        String[] ones = {
                "", "One", "Two", "Three", "Four", "Five",
                "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
                "", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String words = "";

        // Hundreds place
        if (num >= 100) {
            words += ones[num / 100] + " Hundred ";
            num = num % 100;
        }

        // Tens and Ones
        if (num >= 20) {
            words += tens[num / 10] + " ";
            num = num % 10;
        }

        // 1 to 19
        if (num > 0) {
            words += ones[num] + " ";
        }

        return words.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0 to 9999): ");
        int n = sc.nextInt();

        if (n < 0 || n > 9999) {
            System.out.println("Invalid input! Enter number only between 0 to 9999.");
        }
        else if (n == 0) {
            System.out.println("Zero");
        }
        else {

            String result = "";

            // Thousands place
            if (n >= 1000) {
                result += display(n / 1000) + " Thousand ";
                n = n % 1000;
            }

            // Remaining 1 to 999
            if (n > 0) {
                result += display(n);
            }

            System.out.println("In Words: " + result.trim());
        }

        sc.close();
    }
}
