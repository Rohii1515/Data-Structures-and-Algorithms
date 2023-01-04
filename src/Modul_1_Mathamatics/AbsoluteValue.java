import java.util.*;

public class AbsoluteValue {
    public static int absolute(int input) {
        if(input<0) {
            return input * -1;
        }
        return input;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Absolute Value: ");
        int temp=sc.nextInt();
        System.out.println(absolute(temp));
        sc.close();
    }
}
