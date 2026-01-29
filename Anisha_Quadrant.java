import java.util.Scanner;
public class Anisha_Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Point lies in First Quadrant");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Point lies in Second Quadrant");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Point lies in Third Quadrant");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Point lies in Fourth Quadrant");
        } 
        else if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin");
        } 
        else if (x == 0 && y != 0) {
            System.out.println("Point lies on Y-axis");
        } 
        else if (x != 0 && y == 0) {
            System.out.println("Point lies on X-axis");
        }

        sc.close();
    }
}
