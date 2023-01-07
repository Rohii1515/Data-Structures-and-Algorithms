package Modul_3_Recursion;
import java.util.*;


public class Recursion_Factorial {

    static int factorial(int n) {
        //Factorial Fact(n)= n*n-1.....1
        //fact(4)=4*3*2*1=24
        if(n==0 || n==1)
            return 1;
        else {
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENter a number: ");
        int num= sc.nextInt();
        System.out.println("Factorial: "+factorial(num));
        sc.close();
    }
}
