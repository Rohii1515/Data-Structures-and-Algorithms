public class Remove_Duplicate_Sorted_A {

    public static int removeDup(int arr[]) {
        int n = arr.length;
        int rd = 0;
        for (int i = 1; i < n; i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
            }
        }
        return rd;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 30, 30 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int rd = removeDup(arr);

        for (int i = 0; i <= rd; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
