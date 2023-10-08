package Java_Intro_1.numberSystem;
import java.util.*;

public class anyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getAnyBaseAddition(n1, n2, b));
    }
    public static int getAnyBaseAddition(int n1, int n2, int b){
        int c = 0;
        int rv = 0;
        int p = 1;
        while (n1 != 0 || n2 != 0 || c != 0){
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            int d = d1 + d2 + c;
            int r = d % b;

            rv += r * p;
            c = d / b;
            p = p * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
        }
        return rv;
    }
}
