package Java_Intro_1.numberSystem;
import java.util.*;

public class anyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(anyBaseToDec(n, b));
    }
    public static int anyBaseToDec(int n, int b){
        int rv = 0;
        int p = 1;
        while (n != 0){
            int dig = n % 10;
            rv = rv + (dig * p);
            p = p * b;
            n = n /10;
        }
        return rv;
    }
}
