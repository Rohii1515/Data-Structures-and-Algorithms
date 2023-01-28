import java.util.*;

public class FindMatch {

    public static int search(int arr[], int len, int x) {
        for (int i = 0; i < len; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element to Find: ");
        int x = sc.nextInt();
        System.out.println(search(arr, arr.length, x));
    }
}