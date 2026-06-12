package sorting;

import java.util.Scanner;

public class Bubblesort {
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

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: check if swapping occurred
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap the elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
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
