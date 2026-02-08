import java.util.Scanner;
public class Anisha_SmallestNumberRecusion {
    static int findMin(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        int minOfRest = findMin(arr, n - 1);
        return Math.min(arr[n - 1], minOfRest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr, n);

        System.out.println("Smallest Element is " + min);
        sc.close();
    }
}
