import java.util.Arrays;
import java.util.Scanner;

public class Solution4 {

    public static double findMedian(double[] arr) {
        int n = arr.length;

        // Sort the array
        Arrays.sort(arr);

        // If number of elements is odd
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            // If number of elements is even
            double mid1 = arr[(n / 2) - 1];
            double mid2 = arr[n / 2];
            return (mid1 + mid2) / 2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        int n = scanner.nextInt();

        // Input array elements
        double[] arr = new double[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        double median = findMedian(arr);
        System.out.println(median);

    }
}
