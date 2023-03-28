import javax.naming.spi.DirStateFactory.Result;

public class Last_occurrence {

    public static int searchOp(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                result = mid;
                start = mid + 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 10, 50, 60, 60, 60, 60 };
        System.out.println(searchOp(arr, 60));
    }
}