import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Enter target value to search: ");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
