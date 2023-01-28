import java.util.*;

public class FindMatch {

    public static int find(int arr[], int x, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Element to find in array:");
        int x = sc.nextInt();
        int arr[] = { 10, 20, 30, 40, 50 };
        System.out.println(find(arr, x, arr.length));
    }
}