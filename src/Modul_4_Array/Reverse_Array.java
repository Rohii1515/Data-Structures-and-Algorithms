public class Reverse_Array {

    public static void reverseArray(int a[]) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
