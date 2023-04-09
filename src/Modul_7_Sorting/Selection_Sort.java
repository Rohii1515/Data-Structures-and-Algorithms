public class Selection_Sort {
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElem = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElem] > arr[j]) {
                    minElem = j;
                }
            }
            int temp = arr[minElem];
            arr[minElem] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}