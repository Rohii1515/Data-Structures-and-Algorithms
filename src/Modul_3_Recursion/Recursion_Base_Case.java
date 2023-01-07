package Modul_3_Recursion;

public class Recursion_Base_Case {

    static void rec_Fun(int n) {
        if(n==0) 
            return;
        System.out.println("Rec");
        rec_Fun(n-1);

    }
    public static void main(String[] args) {
        rec_Fun(2);
    }
}
