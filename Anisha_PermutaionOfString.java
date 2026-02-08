import java.util.Scanner;
public class Anisha_PermutaionOfString {


    // Recursive function to generate permutations
    static void permute(String str, String ans) {

        // Base case: if string becomes empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        // Pick each character one by one
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Remaining string after removing chosen character
            String left = str.substring(0, i);
            String right = str.substring(i + 1);

            String remaining = left + right;

            // Recursive call
            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("All permutations are:");
        permute(str, "");
        sc.close();
    }
}

