public class Number_of_occurrence {

    public static int firstInd(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        int firstelem = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                firstelem = mid;
                end = mid - 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstelem;
    }

    public static int lastInd(int arr[], int x) {
        int start = 0, end = arr.length - 1;
        int lastelem = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid]) {
                lastelem = mid;
                start = mid + 1;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return lastelem;
    }

    public static int countEle(int ar[], int elem) {
        int xStart, xEnd;
        xStart = firstInd(ar, elem);
        if (xStart == -1) {
            return 0;
        }
        xEnd = lastInd(ar, elem);
        int count = xEnd - xStart + 1;

        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 10, 10, 10, 50, 60, 60, 60, 60 };
        System.out.println("Number Of Occurrence Elem: " + countEle(arr, 60));

    }
}
