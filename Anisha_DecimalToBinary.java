import java.util.Scanner;
public class Anisha_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        int num = sc.nextInt();
        sc.close();
        int[] binary = new int[32];
        int index = 0;
        while (num > 0) {
            binary[index] = num % 2;
            num = num / 2;
            index++;
        }
        System.out.print("Binary value = ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}
