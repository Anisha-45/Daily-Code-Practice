import java.util.Scanner;

public class Anisha_PowerOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();
        sc.close();

        int ans = 1;

        if (num == 0 && power == 0) {
            System.out.println("0 to the power 0 is indeterminate");
        }
        else if (power == 0) {
            System.out.println("The power of number " + num + " to the power " + power + " is 1");
        }
        else if (power == 1) {
            System.out.println("The power of number " + num + " to the power " + power + " is " + num);
        }
        else {
            for (int i = 1; i <= power; i++) {
                ans *= num;
            }
            System.out.println("The power of number " + num + " to the power " + power + " is " + ans);
        }
    }
}
