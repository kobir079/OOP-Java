import java.util.Scanner;

public class FactorionNumber {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isFactorion(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound of the range: ");
        int upperBound = scanner.nextInt();

        System.out.println("Factorion numbers in the range:");
        boolean found = false;

        for (int i = lowerBound; i <= upperBound; i++) {
            if (isFactorion(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No factorion numbers found in the given range.");
        }

        scanner.close();
    }
}
