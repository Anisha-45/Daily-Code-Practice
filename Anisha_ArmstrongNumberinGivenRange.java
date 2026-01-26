import java.util.Scanner;
public class Anisha_ArmstrongNumberinGivenRange {

    static int count(int n){
        int c =0;
        while(n>0){
            c++;
            n = n/10;
        }
        return c;
    }
    static boolean isArmStrong(int num){
        int len = count(num);
        int temp = num;
        int sum = 0;
        while(temp>0){
            int di = temp%10;
            sum = sum + (int) Math.pow(di,len);
            temp/=10;
        }
        return sum==num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low;i<=high;i++){
            if(isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
