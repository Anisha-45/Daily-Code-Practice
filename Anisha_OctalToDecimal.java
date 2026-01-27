import java.util.Scanner;

public class Anisha_OctalToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();
        sc.close();

        int decimal = 0;
        int power = 0;

        while (octal > 0) {
            int digit = octal % 10;
            decimal = decimal + digit * (int)Math.pow(8, power);
            octal = octal / 10;
            power++;
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}

