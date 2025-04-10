import java.util.Scanner;

public class Solution6 {

    // Method to count vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Method to find the string with the most vowels
    public static String findStringWithMostVowels(String[] arr) {
        String maxVowelString = "";
        int maxVowels = 0;

        for (String s : arr) {
            int vowelCount = countVowels(s);
            if (vowelCount > maxVowels) {
                maxVowels = vowelCount;
                maxVowelString = s;
            }
        }

        return maxVowelString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }

        String result = findStringWithMostVowels(words);
        System.out.println(result);
    }
}

