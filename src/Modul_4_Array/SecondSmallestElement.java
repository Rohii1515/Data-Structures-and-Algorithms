public class SecondSmallestElement {
    public static int getSmallest(int arr[]) {
        int min1 = arr[0];
        int min2 = arr[1];

        if (arr[0] < arr[1]) {
            min1 = arr[0];
            min2 = arr[1];

        } else {
            min2 = arr[0];
            min1 = arr[1];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2) {
                min2 = arr[i];
            }
        }
        return min2;

    }

    public static void main(String[] args) {
        int a[] = { 20, 42, 6, 25, 30, 88 };
        System.out.println("Second Smallest Element: " + getSmallest(a));
    }
}
