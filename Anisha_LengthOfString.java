import java.util.Scanner;
public class Anisha_LengthOfString {

    static int lengthRec(String str) {

        // Base case: empty string
        if (str.equals(""))
            return 0;

        // Recursive call (remove first character)
        return 1 + lengthRec(str.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = lengthRec(str);

        System.out.println("Length of " + str + " is " + len);
        sc.close();
    }
}

