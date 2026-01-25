import java.util.Scanner;

public class Anisha_SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

