import java.util.Scanner;
public class Anisha_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("Radius od circle is: "+area);
        sc.close();
    }
}
