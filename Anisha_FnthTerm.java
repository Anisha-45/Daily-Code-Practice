import java.util.Scanner;
public class Anisha_FnthTerm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        long sum = 0;
        int num = 1; // number starts from 1

        for (int i = 1; i <= N; i++) {
            long product = 1;

            // multiply i numbers
            for (int j = 1; j <= i; j++) {
                product = product * num;
                num++;
            }

            sum = sum + product;
        }

        System.out.println(sum);
        sc.close();
    }
}

