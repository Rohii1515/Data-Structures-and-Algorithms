package Modul_3_Recursion;

public class Print_n_to_n_recursive {
    static void printNto1(int n) {
        if(n==0)
        return;
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args) {
        int num=5;
        printNto1(num);
    }
}
