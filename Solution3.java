import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first integer
        int num1 = scanner.nextInt();

        // Input second integer
        int num2 = scanner.nextInt();

        // Determine the larger integer
        int larger = (num1 > num2) ? num1 : num2;

        // Print the result
        System.out.println(larger);
    }
}
