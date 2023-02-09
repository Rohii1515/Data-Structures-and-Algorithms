import java.util.*;

public class InsertElementEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int arr1[] = new int[n + 1];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Element postion to insert element: ");
        int pos = sc.nextInt();
        int idx = pos - 1; // index= postion -1 bcz index starts from 0

        System.out.println("Enter Element: ");
        int x = sc.nextInt();

        for (int i = 0; i < n + 1; i++) {
            if (i < idx) {
                arr1[i] = arr[i];
            } else if (i == idx) {
                arr1[i] = x;
            } else
                arr1[i] = arr[i - 1];
        }

        System.out.println("Array Elements Are________");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
