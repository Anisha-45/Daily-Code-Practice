import java.util.Scanner;
public class Anisha_LCMRecusion {

    // Recursive function to find HCF
    static int hcf(int a, int b) {
        if (b == 0)
            return a;

        return hcf(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcfValue = hcf(num1, num2);

        int lcm = (num1 * num2) / hcfValue;

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
        sc.close();
    }
}


