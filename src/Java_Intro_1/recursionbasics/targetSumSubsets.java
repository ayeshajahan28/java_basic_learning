package Java_Intro_1.recursionbasics;
import java.util.*;
public class targetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        printTargetSumSS(arr, 0, "", 0, tar);
    }
    public static void printTargetSumSS(int[] arr, int i, String set, int sos, int tar){
        if (i==arr.length){
            if (sos == tar){
                System.out.println(set);
            }
            return;
        }
        printTargetSumSS(arr, i+1, set + arr[i] + ", ", sos + arr[i], tar);
        printTargetSumSS(arr, i+1, set , sos, tar);
    }
}
