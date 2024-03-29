public class IntersectionofTwoArrays {

    public static void intersection(int a[], int b[]) {
        int i = 0, j = 0;
        int m = a.length;
        int n = b.length;

        while (i < m && j < n) {
            // for handling duplicates elements in array;
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 20, 20, 40, 60 };
        int b[] = { 10, 20, 20, 20 };

        intersection(a, b);

    }
}