public class Check_Array_sorted_naive_app {

    public static boolean checkSorted(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 40, 50 };
        System.out.println(checkSorted(arr));
    }
}