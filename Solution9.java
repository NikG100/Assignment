import java.util.Scanner;

public class Solution9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        int number = scanner.nextInt();

        // Extract digits (assuming number is positive and two-digit)
        int tens = number / 10;
        int units = number % 10;

        int sum = tens + units + (tens * units);

        if (sum == number) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
