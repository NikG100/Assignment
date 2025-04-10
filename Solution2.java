import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input net price
        double netPrice = scanner.nextDouble();

        // Input tax rate
        double taxRate = scanner.nextDouble();

        // Calculate gross price
        double grossPrice = netPrice / (1 + taxRate);

        // Print the result
        System.out.printf("%.2f\n", grossPrice);
    }
}
