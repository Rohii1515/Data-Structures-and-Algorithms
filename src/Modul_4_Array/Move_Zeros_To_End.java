import java.util.*;

public class Move_Zeros_To_End {

    public static void moveZeros(int arr[]) {
        int size = arr.length;
        int nz = 0, z = 0;

        if (size == 0 || size == 1) {
            return;
        }

        while (nz < size) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }

    }

    public static void main(String[] args) {
        // int arr[] = { 10, 8, 0, 0, 12, 0 };
        int arr[] = { 0, 0, 0, 10, 0, 20, 30, 0, 50 };
        System.out.println("Before arranging array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        moveZeros(arr);

        System.out.println("After arranging array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}