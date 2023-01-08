package Modul_3_Recursion;

public class Print1toN {
    static void print1toN(int n) {
        if(n==0)
        return;
        print1toN(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        int num=5;
        print1toN(num);
    }
}
