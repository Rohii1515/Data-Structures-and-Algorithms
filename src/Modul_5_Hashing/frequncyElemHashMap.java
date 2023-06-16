import java.util.*;

public class frequncyElemHashMap {

    static void count(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 30, 10 };
        int n = arr.length;
        count(arr, n);
    }
}