public class Left_Rotate_Arr_By_One {

    public static void rotateArray(int arr[]) {
        int size = arr.length;
        int firstvalue = arr[0];

        if (size == 0 || size == 1) {
            return;
        }

        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];

        }
        arr[size - 1] = firstvalue;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Before array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotateArray(arr);
        System.out.println("After Rotating array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
