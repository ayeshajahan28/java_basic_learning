package Java_Intro_1.numberSystem;
import java.util.*;

public class decimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(decToAnyBase(n, b));
    }
    public static int decToAnyBase(int n, int b){
        int x = 0;
        int p = 1;
        while (n != 0){
            int dig = n % b;
            x = x + (dig * p);
            p = p * 10;
            n = n / b;
        }
        return x;
    }
}
