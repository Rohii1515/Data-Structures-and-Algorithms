public class Merge_Two_Sorted_arrys {

    public static void merge(int a[], int b[]) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
            while (i < m) {
                System.out.print(a[i] + " ");
                i++;
            }
            while (j < n) {
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 50 };
        int b[] = { 5, 50, 50 };
        merge(a, b);
    }
}