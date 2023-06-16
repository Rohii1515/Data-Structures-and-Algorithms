public class Insetion_Sort {

    public static void insertionSorting(int arr[]) {
        // outer loop for comparing current element to prev element
        // start checking element from 1 bcz 0 element is always sorted;

        for (int i = 1; i < arr.length; i++) {
            // creating current element to store current element in that;
            int curr = arr[i];
            // creating previous element to check perfect postion for current elemnt to
            // store
            int prev = i - 1;
            // while loop is used to search in sorted array at the left side
            while (prev >= 0 && arr[prev] > curr) {
                // shifting larger element to right side
                arr[prev + 1] = arr[prev];
                prev--;
                // prev-- for comparing in left sorted array

            }
            // placinf element at its perfect position
            // prev+1:- is used for prev is always head one step
            // prev-- becomes -1 so prev+1=0;
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
