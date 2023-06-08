public class frequncyElemArray_Naive {

    static void count(int arr[], int n) {
        // outer loop for traversing left to right elements
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            // inner loop to check current item seen before or not
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true)
                continue;
            int freq = 1;
            // inner loop to check item that not seen before and update frequncy
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                }
            }
            System.out.println(arr[i] + " " + freq);

        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 10 };
        int n = arr.length;

        count(arr, n);
    }
}