public class FrequOfElementsSortedArray {

    public static void findFrequ(int arr[]) {
        int freq = 1, i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i - 1] == arr[i]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            freq = 1;
            i++;
        }
        if (arr.length == 1 || arr[i - 1] != arr[i - 2]) {
            System.out.println(arr[i - 1] + " " + freq);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 40 };
        findFrequ(arr);
    }

}
