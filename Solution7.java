import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        double rate = scanner.nextDouble();

        int years = scanner.nextInt();

        // Convert rate to decimal
        double decimalRate = rate / 100;

        // Calculate compounded inflation factor
        double compoundedFactor = Math.pow(1 + decimalRate, years);

        // Calculate compounded inflation percentage and round it
        long compoundedInflation = Math.round((compoundedFactor - 1) * 100);

        // Output the result
        System.out.printf("%d\n", compoundedInflation);

        scanner.close();
    }
}
