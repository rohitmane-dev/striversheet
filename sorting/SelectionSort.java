import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare the array
        int[] a = new int[n];

        // Input: Array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number at index " + i + ": ");
            a[i] = sc.nextInt();
        }

        // Print unsorted array
        System.out.println("Unsorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        // Print sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
