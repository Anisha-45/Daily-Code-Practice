import java.util.Scanner;

public class Anisha_OctalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Octal Number: ");
        String octal = sc.next();
        sc.close();

        // Step 1: Octal to Decimal
        int decimal = 0;
        int power = 0;

        for (int i = octal.length() - 1; i >= 0; i--) {
            int digit = octal.charAt(i) - '0';
            decimal += digit * Math.pow(8, power);
            power++;
        }

        // Step 2: Decimal to Binary
        int[] binary = new int[32];
        int index = 0;

        while (decimal > 0) {
            binary[index] = decimal % 2;
            decimal = decimal / 2;
            index++;
        }

        System.out.print("Binary value = ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
