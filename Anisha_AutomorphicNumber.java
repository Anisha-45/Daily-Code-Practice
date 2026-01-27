import java.util.Scanner;
public class Anisha_AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int sq = n*n;
        String num = String.valueOf(n);
        String square = String.valueOf(sq);
        if(square.endsWith(num)){
            System.out.println("Yes, it's an AUtomorphic Number");

        }
        else{
            System.out.println("No it's not an Automorphic Number");
        }

    }
}
