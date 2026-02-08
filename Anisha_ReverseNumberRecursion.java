import java.util.Scanner;
public class Anisha_ReverseNumberRecursion {
    static int reverseNum(int n, int rev) {
        if (n == 0)
            return rev;

        int lastDigit = n % 10;
        rev = rev * 10 + lastDigit;

        return reverseNum(n / 10, rev); 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = reverseNum(n, 0);

        System.out.println("Reversed number is: " + reverse);
        sc.close();
    }
}
