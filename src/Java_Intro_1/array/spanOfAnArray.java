package Java_Intro_1.array;
import java.util.*;

public class spanOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(arraySpan(arr));
        System.out.println(findElement(arr, key));
    }

    public static int arraySpan(int [] arr){

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            } if (arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }

    public static int findElement(int [] arr, int key){
        int idx = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                idx  = i;
                break;
            }
        }
        return idx;
    }
}
