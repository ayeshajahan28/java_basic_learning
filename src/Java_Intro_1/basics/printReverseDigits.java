package Java_Intro_1.basics;
import java.util.*;

public class printReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        while (n != 0){
            int dig = n % 10;
            System.out.println(dig);
            n = n / 10;
        }
    }
}
