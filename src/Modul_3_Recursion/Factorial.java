package Modul_3_Recursion;

public class Factorial {

    public static int fact(int n) {
        if (n == 1)
            return 1;

        return n * fact(n - 1);

    }

    // public static int factorial(int n) {
    // if (n == 1) {
    // System.out.println("factorial(" + n + ") = 1");
    // return 1;
    // } else {
    // System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n - 1)
    // + ")");
    // return n * factorial(n - 1);
    // }
    // }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        // 5! = 5 * (4 * 3 * 2 * 1) = 120
        // System.out.println(factorial(10));
    }
}
