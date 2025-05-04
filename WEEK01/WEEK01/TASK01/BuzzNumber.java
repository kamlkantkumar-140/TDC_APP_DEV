import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num % 10 == 7 || num % 7 == 0) {
            System.out.println(num + " is a Buzz Number.");
        } else {
            System.out.println(num + " is not a Buzz Number.");
        }

        scanner.close();
    }
}
