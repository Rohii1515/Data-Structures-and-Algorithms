
import java.util.*;
import java.lang.*;
import java.io.*;

class Simple_Bubble_Sort {
    public static void bubbleSort(int arr[]) {
        // outer loop for Turns
        boolean swap = false;
        for (int i = 0; i < arr.length - 1; i++) {
            // inner loop for checking adjcent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
                if (swap == false) {
                    break;
                }

            }

        }
    }

    public static void printing(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int arr[] = { 5, 4, 1, 3, 2 };
        bubbleSort(arr);
        printing(arr);
    }
}
