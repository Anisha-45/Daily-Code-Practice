import java.util.Scanner;

public class Anisha_CountNumberOfDigitsInInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int count = 0;
        int temp = num;

        if (temp == 0) {
            count = 1;
        } else {
            if (temp < 0) {
                temp = -temp;  // convert negative to positive
            }

            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
        sc.close();
    }
}
