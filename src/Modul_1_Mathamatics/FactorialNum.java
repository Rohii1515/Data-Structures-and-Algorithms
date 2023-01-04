package Modul_1_Mathamatics;

import java.util.*;

public class FactorialNum {

    public static long fact(int n) {
        int total=1;
        for(int i =2; i<=n; i++) {
            total=total*i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int input= sc.nextInt();
        System.out.println(fact(input));
        sc.close();
    }
}
