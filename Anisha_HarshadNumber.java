import java.util.Scanner;
public class Anisha_HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int sum =0;
        while(num>0){
            int ld = num%10;
            sum = sum+ld;
            num/=10;
        }
        if(num%sum==0){
            System.out.println("Harshad Number.");
        }
        else{
            System.out.println("Not a Harshad Number");
        }
    }
}
