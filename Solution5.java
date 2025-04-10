import java.util.Scanner;

public class Solution5 {

    public static int calculateIncomeTax(int income) {
        int tax = 0;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = (income - 250000) * 10 / 100;
        } else if (income <= 1000000) {
            tax = (500000 - 250000) * 10 / 100;
            tax += (income - 500000) * 20 / 100;
        } else {
            tax = (500000 - 250000) * 10 / 100;
            tax += (1000000 - 500000) * 20 / 100;
            tax += (income - 1000000) * 30 / 100;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input income
        int income = scanner.nextInt();

        int tax = calculateIncomeTax(income);
        System.out.println(tax);

    }
}
