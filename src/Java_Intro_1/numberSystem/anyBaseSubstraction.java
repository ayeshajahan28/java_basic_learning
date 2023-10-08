package Java_Intro_1.numberSystem;
import java.util.*;

public class anyBaseSubstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getAnyBaseSubstraction(n1, n2, b));
    }

    public static int getAnyBaseSubstraction(int n1, int n2, int b){
        int rv = 0;
        int p = 1;
        int borrow = 0;

        while (n2 > 0){
            int d1 = n1 % 10;
            int d2 = (n2 % 10) + borrow;
            n1 = n1 / 10;
            n2 = n2 / 10;

            if (d2 < d1){
                borrow = -1;
                d2 = d2 + b;
            }
            int d = d2 - d1;
            rv += d * p;
            p = p * 10;
        }
        return rv;
    }
}
