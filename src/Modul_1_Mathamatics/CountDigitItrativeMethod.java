

import java.util.Scanner;

public class CountDigitItrativeMethod {
    public static int CountDigit(long input) {
        int count=0;
        while(input !=0) {
            input=input/10;
            count= count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Integer numbers: ");
        int input= sc.nextInt();
        System.out.println("Digits counts: "+CountDigit(input));
        sc.close();
    }
}
