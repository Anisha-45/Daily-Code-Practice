import java.util.Scanner;

public class Anisha_BinaryToOctal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        String binary = sc.next();
        sc.close();

        // Step 1: Binary to Decimal
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int digit = binary.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }

        // Step 2: Decimal to Octal
        int[] octal = new int[32];
        int index = 0;

        while (decimal > 0) {
            octal[index] = decimal % 8;
            decimal = decimal / 8;
            index++;
        }

        System.out.print("Octal value = ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(octal[i]);
        }
    }
}
