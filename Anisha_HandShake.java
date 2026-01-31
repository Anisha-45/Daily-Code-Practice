import java.util.Scanner;
public class Anisha_HandShake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int total = (num-1)*num /2;
        System.out.println("for "+num+" people there will be "+total+" handshakes");
    }
}
