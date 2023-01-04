//package Modul_1_Mathamatics;
import  java.util.*;
public class PrimeNumUsingNaiveMethod {
    public static boolean checkprime(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2; i<n; i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter an number to check is prime or not ! ");
        int input= sc.nextInt();
        boolean result= checkprime(input);
        System.out.println(result);
    }
}
