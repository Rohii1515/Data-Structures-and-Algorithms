package Modul_3_Recursion;

public class Recursion_ex3 {
    static void fun(int n) {
        if(n==0)
        return;
     fun(n/2);
     System.out.println(n%2);
    }
    public static void main(String[] args) {
        int num=7;
        fun(num);
    }
}
