package Modul_3_Recursion;
import java.util.*;


public class Sum_of_Digits {

    public static int fun(int n) {
        if(n<10)
        return n;
     return fun(n/10)+n%10;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an digits to get sum:" );
        int n= sc.nextInt();
        System.out.println("Sum: "+fun(n));
        sc.close();
    }
}