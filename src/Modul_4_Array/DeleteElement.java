
public class DeleteElement {

    public static int deleateArr(int arr[], int n, int x) {
        int i = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] == x)
                break;
        }
        // if there is no element found then return array
        if (i == n)
            return n;

        for (int j = i; j < n - 1; j++) {
            arr[j] = arr[j + 1];
        }

        return (n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int len = arr.length;
        System.out.println("Before delete array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(" " + arr[i]);
        }

        int x = 3;
        len = deleateArr(arr, len, x);

        System.out.println();

        System.out.println("After deleate array elements: ");
        for (int i = 0; i < len; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
