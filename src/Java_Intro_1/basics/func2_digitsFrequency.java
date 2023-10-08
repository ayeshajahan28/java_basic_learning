package Java_Intro_1.basics;
import java.util.*;

public class func2_digitsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();

        System.out.println(getDigitsFreq(n, key));
    }
    public static int getDigitsFreq(int x, int key) {
        int count = 0;
        while (x != 0) {
            int dig = x % 10;
            x = x / 10;
            if (dig == key){
                count++;
            }
        }
        return count;
    }
}
