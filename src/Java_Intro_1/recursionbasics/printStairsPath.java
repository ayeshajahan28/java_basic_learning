package Java_Intro_1.recursionbasics;
import java.util.*;

public class printStairsPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSP(n, "");
    }
    public static void printSP(int n, String paths){
        if (n<0){
            return;
        } if (n==0){
            System.out.println(paths);
            return;
        }
        printSP(n-1, paths + 1);
        printSP(n-2, paths + 2);
        printSP(n-3, paths + 3);
    }
}
