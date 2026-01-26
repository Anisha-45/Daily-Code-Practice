import java.util.Scanner;
public class Anisha_FactorialOfnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        sc.close();
        int fac = 1;
        for(int i =1;i<=num;i++){
            fac*=i;
        }
        System.out.println("Factorial = " + fac);
    }
}
