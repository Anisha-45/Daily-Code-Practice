import java.util.Scanner;

public class Anisha_GreatestOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        sc.close();

        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the greatest number");
        }
        else if (c > a && c > b) {
            System.out.println(c + " is the greatest number");
        }
        else {
            System.out.println("All three numbers are equal or two are equal and greatest");
        }
    }
}

