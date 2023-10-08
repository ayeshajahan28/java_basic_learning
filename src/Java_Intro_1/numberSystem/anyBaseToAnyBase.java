package Java_Intro_1.numberSystem;
import java.util.*;

public class anyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        System.out.println(getValue(n, b1, b2));

    }
    public static int getValue(int n, int b1, int b2){
        int dec = anyBaseToDec(n, b1);
        int dn = DecToAnyBase(dec, b2);
        return dn;
    }
    public static int anyBaseToDec(int n, int b){
        int rv = 0;
        int p = 1;
        while (n != 0){
            int dig = n % 10;
            rv = rv + (dig * p);
            p = p * b;
            n = n / 10;
        }
        return rv;
    }
    public static int DecToAnyBase(int n, int b){
        int rv = 0;
        int p = 1;
        while (n != 0){
            int dig = n % b;
            rv = rv + (dig * p);
            p = p * 10;
            n = n / b;
        }
        return rv;
    }

}
