package Java_Intro_1.basics;
import java.util.*;

public class printAllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++){
            for (int div = 2; div * div <= i; div++){
                int count = 0;
                if (i % div == 0){
                    count++;
                    break;
                }
                if (count == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
