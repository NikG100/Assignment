import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        
        // Make number positive
        number = Math.abs(number);

        int digitCount = 0;

        // Special case for 0
        if (number == 0) {
            digitCount = 1;
        } else {
            while (number > 0) {
                number = number / 10;
                digitCount++;
            }
        }

        System.out.println(digitCount);
    }
}
