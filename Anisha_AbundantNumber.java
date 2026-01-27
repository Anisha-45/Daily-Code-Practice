import java.util.Scanner;
public class Anisha_AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum > num) {
            System.out.println("It's an Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
    }
}
