import java.util.Scanner;

public class Solution8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: total number of seconds
        long totalSeconds = scanner.nextLong();

        // Convert seconds to days, hours, minutes, and seconds
        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);

        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;

        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        // Output
        System.out.printf("%d Day(s) %d Hour(s) %d Minute(s) %d Second(s)\n", days, hours, minutes, seconds);

        scanner.close();
    }
}
