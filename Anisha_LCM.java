
import java.util.Scanner;
public class Anisha_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int max = Math.max(a, b);

        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }
    }
}
