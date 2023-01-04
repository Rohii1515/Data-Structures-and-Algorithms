import java.util.*;

public class CountDigitRecresiveMethod {
    public static int countdigit(long input) {
        int count=0;
        if(input==0) {
            return 0;
        }
        return 1+countdigit(input/10);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Integer numbers: ");
        int input= sc.nextInt();
        System.out.println("Digits counts: "+countdigit(input));
   } 
}
