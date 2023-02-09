public class Printing_Reverse_array {

    public static void printArr(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(" " + a[i]);
        }
    }
    //demo

    public static void main(String[] args) {
        // int arr[] = new int[5];
        int arr[] = { 10, 20, 30, 40, 50 };
        printArr(arr, arr.length);
    }
}