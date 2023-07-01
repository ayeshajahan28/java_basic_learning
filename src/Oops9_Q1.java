import java.util.*;
// i = sq rt of (-1) and i^2 = (-1) where i is an imaginary number.

public class Oops9_Q1 {
    public static void main(String[] args) {
        Complex c = new Complex();
        System.out.println(c.sum(4,5));
        System.out.println(c.diff(8,4));
        c.product(5,2);

    }
}
    class Complex   {
        int a;
        int b;

        int sum(int a, int b){
            return a + b;
        }
        int diff(int a, int b){
            return a - b;
        }
        void product(int a, int b){
            System.out.println(a*b);
        }

    }

