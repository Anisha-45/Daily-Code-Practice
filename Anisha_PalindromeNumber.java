import java.util.Scanner;
public class Anisha_PalindromeNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    sc.close();
    int temp = num;
    int rev = 0;
    while(temp>0){
        int ld = temp%10;
        rev = rev*10+ld;
        temp/=10;
    }
    if(num==rev){
        System.out.println("Palindrome");
    }
    else{
        System.out.println("Not a palindrome");
    }

}

}
