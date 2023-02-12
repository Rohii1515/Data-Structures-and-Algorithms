public class Check_Array_sorted_Liner_techniq {

    public static boolean sortedArray(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 40 };
        if (true == sortedArray(arr)) {
            System.out.println("Array is Sorted!");
        } else {
            System.out.println("Array is unSorted!");
        }
    }
}
