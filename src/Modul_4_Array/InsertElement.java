public class InsertElement {

    public static int insert(int arr[], int n, int cap, int x, int pos) {
        if (n == cap)
            return n;
        int indx = pos - 1;

        for (int i = n - 1; i >= indx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[indx] = x;
        return n + 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[5], cap = 5, n = 3;
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;
        System.out.println("Array Before Insertion !");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        int x = 6, pos = 2;
        n = insert(arr, n, cap, x, pos);
        System.out.println("After Insertion Operation ! Array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
