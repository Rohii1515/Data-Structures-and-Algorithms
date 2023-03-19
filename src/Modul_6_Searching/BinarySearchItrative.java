
public class BinarySearchItrative {

    public static int Bsearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low / 2);
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println(Bsearch(arr, 550));
    }
}