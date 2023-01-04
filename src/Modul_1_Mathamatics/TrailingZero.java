import java.util.*;
public class TrailingZero {
    public static int countzero(int n) {
        int result=0;
        for(int i=5; i<=n; i=i*5) {
            result= result+n/i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an number: ");
        int input= sc.nextInt();
        int count=countzero(input);
        System.out.println(count);
    }
}