import java.util.Scanner;
public class Anisha_DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int num = sc.nextInt();
        sc.close();
        int[] octal = new int[32];
        int index = 0;
        while (num > 0) {
            octal[index] = num % 8;
            num = num / 8;
            index++;
        }
        System.out.print("Octal value = ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(octal[i]);
        }
    }
}

