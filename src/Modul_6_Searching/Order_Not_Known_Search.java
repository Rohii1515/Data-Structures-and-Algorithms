public class Order_Not_Known_Search {

    public static int searchOpr(int arr[], int start, int end, int x) {

        // Checking the sorted order of the given array
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check if x is present at mid
            if (x == arr[mid]) {
                return mid;
            }
            // Ascending order
            if (isAsc == true) {
                // if x is greater, ignore the left half
                if (x > arr[mid]) {
                    start = mid + 1;
                }
                // if x is smaller, ignore right half:
                else {
                    end = mid - 1;
                }
            }

            // Descending order
            else {
                // if x smaller, ignore left half
                if (x < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 40, 10, 5, 2, 1 };
        int x = 10;
        int n = arr.length;
        System.out.println(searchOpr(arr, 0, n - 1, x));
    }
}
