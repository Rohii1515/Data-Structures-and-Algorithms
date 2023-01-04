import java.util.*;

public class PalidronNumber {

    public int reverse(int num) {
        int rev=0;
        while(num!=0) {
            int reminder = num%10;
            rev= rev*10+reminder;
            num=num/10;
        }
        return rev;

    }

    public boolean checkpalidron(int input, int rev ) {
        if(input==rev) {
            return true;    
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        PalidronNumber obj= new PalidronNumber();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to reverse: ");
        int input= sc.nextInt();
        int reverse= obj.reverse(input);
        System.out.println(reverse);
        boolean pali= obj.checkpalidron(input, reverse);
        System.out.println(pali);
    }
}
