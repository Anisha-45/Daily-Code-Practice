import java.util.Scanner;
public class Anisha_Permutation {
    public  static int fact(int n){
        int  fact = 1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        int res = fact(n)/fact(n-r);
        System.out.println(res);
    }
}
