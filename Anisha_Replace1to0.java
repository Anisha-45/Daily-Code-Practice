import java.util.*;
public class Anisha_Replace1to0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        sc.close();

        int result = 0;
        int place = 1;

        while (num > 0) {
            int digit = num % 10;   // get last digit

            if (digit == 0) {
                digit = 1;          // replace 0 with 1
            }

            result = result + digit * place;
            place = place * 10;
            num = num / 10;    
        }  
        System.out.println("Number after replacing 0 with 1: " + result);
    }   
}
