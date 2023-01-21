import java.util.*;

public class TOH {

    public static void solve(int s, int d, int h, int n) {
        if(n==1) {
            System.out.println("Moving Disk "+n+" From "+s+" To "+d);
            return;
        }
        solve(s, h, d, n-1);
        System.out.println("Moving Disk "+n+" From "+s+" To "+d);
        solve(h, d, s, n-1);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of plats in TOH!: ");
        int n= sc.nextInt();
        int s=1,h=2,d=3;
        solve(s, d, h, n);

    }
}
