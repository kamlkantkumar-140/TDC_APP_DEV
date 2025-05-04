import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;

        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            // Convert Math.pow result to int
            sum += (int)Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number.");
        } else {
            System.out.println(original + " is not an Armstrong Number.");
        }

        scanner.close();
    }
}
