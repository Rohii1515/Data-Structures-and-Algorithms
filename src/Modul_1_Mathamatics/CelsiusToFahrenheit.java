import java.util.*;

public class CelsiusToFahrenheit {
    public static double ctof(double input) {
        double Fahrenheit=((input*9)/5)+32;  
        return Fahrenheit;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Temp in Celsius: ");
        double tem= sc.nextInt();
        System.out.println(ctof(tem));
    }
}