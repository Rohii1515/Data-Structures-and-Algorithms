import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);
        list.add(1, 50);
        System.out.println(list);

        List<Integer> mylist = new ArrayList<>();
        mylist.add(20);
        mylist.add(30);

        System.out.println(mylist);
        // merge mylist with list and merge elements merge at last of list
        list.addAll(mylist);
        System.out.println(list);

        list.remove(1); // removing 50 from 1st index
        System.out.println(list);

        list.remove(Integer.valueOf(20)); // this will remove 20 integer directly from list without index
        System.out.println(list);

        list.clear(); // this will remove all elements from the list
        System.out.println(list);

    }
}
