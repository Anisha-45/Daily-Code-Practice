import java.util.Scanner;
public class Anisha_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sc.close();
        int len = count(num);
        if(armstrong(num,len)){
            System.out.println(num + " is an armstrong");
        }
        else{
            System.out.println(num + " is not  an armstrong");
        }

    }
    static int count (int x){
        int c = 0;
        while(x>0){
            c++;
            x = x/10;
        }
        return c;
    }
    static boolean armstrong(int num,int len){
        int sum =0;
        int temp = num;
        while(temp!=0){
            int ld = temp%10;
            sum = sum + (int)Math.pow(ld,len);
            temp/=10;
        };
        return sum==num;
    }
}
