import java.util.*;
import java.io.*;


public class insertionsort{
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

        // Insertion  Sort
        for (int i = 0; i <= n - 1; i++) {
            int j=i;
            while(j>0 && a[j] < a[j-1]){
                // Swap the elements
                int temp = a[j-1];
                a[j-1] = a[j];
                a[j] = temp;
                j--;
                   
            }
        }
            
        

        // Print sorted array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();

    }

}


