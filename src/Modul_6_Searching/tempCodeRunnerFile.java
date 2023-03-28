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