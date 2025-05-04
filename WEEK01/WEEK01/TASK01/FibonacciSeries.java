
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User se input lena
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Pehle do terms define karte hain
        int first = 0, second = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");

        // Loop chalayenge n times
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // current term print karo

            // agla term calculate karo
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close(); // Scanner band karo
    }
}
