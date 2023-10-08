package Java_Intro_1.basics;
import java.util.*;
public class printDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0; //first calculate count of digits
        while (n != 0) {
            n = n / 10;
            count++;
        }

        int div = (int) Math.pow(10, count - 1); // 2nd divide no. by 10^count-1 and print quotient
        while (div != 0) {
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }
    }
}
