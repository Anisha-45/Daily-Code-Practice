import java.util.Scanner;
public class Anisha_DaysInMonthGivenYear {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Enter between 1 to 12.");
        }

        else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))
            System.out.println("Number of days is 29");

        else if (month == 2)
            System.out.println("Number of days is 28");

        else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                 month == 8 || month == 10 || month == 12)
            System.out.println("Number of days is 31");

        else
            System.out.println("Number of days is 30");

        sc.close();
    }
}
