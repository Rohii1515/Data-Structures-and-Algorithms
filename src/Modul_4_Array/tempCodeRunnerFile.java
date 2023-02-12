public class SecondLargestElementex2 {

    public static int getLargElement(int arr[]) {
        int result = -1, largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (result == -1 || arr[i] > arr[largest])
                    result = i;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int a[] = { 12, 12, 12, 7 };
        System.out.println(getLargElement(a));
    }
}
