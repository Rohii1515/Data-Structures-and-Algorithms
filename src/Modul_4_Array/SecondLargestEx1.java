public class SecondLargestEx1 {

    public static int getLargest(int arr[]) {
        int max1 = arr[0];
        int max2 = arr[1];

        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];

        } else {
            max2 = arr[0];
            max1 = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        return max2;

    }

    public static void main(String[] args) {
        int a[] = { 20, 42, 6, 25, 30, 88 };
        System.out.println("Second largest Element: " + getLargest(a));
    }
}
