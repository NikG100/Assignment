import java.util.Scanner;

public class Solution10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize first and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Directly print second largest (no check)
        System.out.println(secondLargest);
    }
}
