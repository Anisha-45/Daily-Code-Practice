import java.util.Scanner;
public class Anisha_FibonacciSerirsuptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int a = 0,b = 1;
        for(int i =0;i<=num;i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    
}
