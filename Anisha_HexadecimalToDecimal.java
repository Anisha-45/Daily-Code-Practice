import java.util.Scanner;
public class Anisha_HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal Number: ");
        String hex = sc.next().toUpperCase();
        sc.close();

        int decimal = 0;
        int power = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }

            decimal += value * Math.pow(16, power);
            power++;
        }

        System.out.println("Decimal value = " + decimal);
    }
}
