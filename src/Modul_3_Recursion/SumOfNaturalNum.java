package Modul_3_Recursion;

public class SumOfNaturalNum {
    static int getSum(int n) {
        if(n==0)
            return 0;
        return n+getSum(n-1);
    }
    public static void main(String[] args) {
        int x=5;
        System.out.println(getSum(x));
    }
}
