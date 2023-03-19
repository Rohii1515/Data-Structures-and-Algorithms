public class Binary_Search_Reverse_Sorted_Array {

    public static int searchOpr(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start / 2);
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 70, 60, 50, 40, 30, 20, 10, 5 };

        System.out.println("Addres of Element: " + searchOpr(arr, 5));
    }
}
