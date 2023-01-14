package Modul_3_Recursion;

public class Fib {

    static int fib(int n) {
        if(n==0)
        return 0;
        if(n==1)
        return 1;
        /*
         * if(n<=1)
         * retun n;
         */
      return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int x=4;
        System.out.println(fib(x));
    }
}