package Modul_3_Recursion;

import java.util.*;


public class IsPalindrome {

    static boolean isPalindrome(String str1, int start, int end) {
        if(start>=end)
        return true;

        return(str1.charAt(start)==str1.charAt(end) && isPalindrome(str1, start+1, end-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string here: ");
        String str= sc.next();
        System.out.println(isPalindrome(str, 0, str.length()-1));
        sc.close();
    }
}
