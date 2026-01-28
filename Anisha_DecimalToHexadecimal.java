
import java.util.Scanner;

public class Anisha_DecimalToHexadecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int num = sc.nextInt();
        sc.close();

        char[] hex = new char[32];
        int index = 0;

        while (num > 0) {
            int rem = num % 16;

            if (rem < 10) {
                hex[index] = (char)(rem + '0');
            } else {
                hex[index] = (char)(rem - 10 + 'A');
            }

            num = num / 16;
            index++;
        }

        System.out.print("Hexadecimal value = ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(hex[i]);
        }
    }
}
