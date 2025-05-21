

public class CumulativeSumSortedArray {
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

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Cumulative sum:");
        int cumulativeSum = 0;
        for (int num : array) {
            cumulativeSum += num;
            System.out.print(cumulativeSum + " ");
        }

        scanner.close();
    }
}
