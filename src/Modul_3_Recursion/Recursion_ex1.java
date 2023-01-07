package Modul_3_Recursion;

public class Recursion_ex1 {
    static void fun(int n) {
        if(n==0)
        return;
    System.out.println(n);
    fun(n-1);
    System.out.println(n);
    }
    public static void main(String[] args) {
        int num=3;
        fun(num);
    }
}
