public class LargestElementArray {

    public static int getLargest(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];

        }
        return max;

    }

    public static void main(String[] args) {
        int a[] = { 10, 50, 160, 20, 40 };
        System.out.println(getLargest(a));
    }
}
