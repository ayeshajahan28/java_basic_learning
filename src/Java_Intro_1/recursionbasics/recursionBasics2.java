package Java_Intro_1.recursionbasics;
import java.util.*;
public class recursionBasics2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(powerLog(x,n));
//        System.out.println(power(x,n));
//        printDecInc(n);


        int n = sc.nextInt();
        int t1d = sc.nextInt();
        int t2d = sc.nextInt();
        int t3d = sc.nextInt();
        toh(n, t1d, t2d, t3d);

//        int[] arr = new int[n];
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int key = sc.nextInt();

//          displayArray(arr,0);
//        displayReverseArray(arr,0);
//        System.out.println(findMax(arr,0));
//        System.out.println(firstOcc(arr, 0,3));
//        System.out.println(lastOcc(arr,0, key));
    }

    public static void printDecInc(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
    //calculate power of x to the n
    public static int power(int x, int n){
        if (n==0){
            return 1;
        } if (x==0){
            return -1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }
//calculate power of x to the n (logarithmic)
    public static int powerLog(int x, int n){
        if (n==0){
            return 1;
        }
        int xnb2 = powerLog(x, n/2);
        int xn = xnb2 * xnb2;
        if(n % 2 == 1){
            xn = xn * x;
        }
        return xn;
    }
//Display array elements using recursion
    public static void displayArray(int arr[], int i){
        if (i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        displayArray(arr, i+1);

    }
//Display array elements in reverse order using recursion
    public static void displayReverseArray(int arr[], int i){
        if (i==arr.length){
            return;
        }
       displayReverseArray(arr, i+1);
        System.out.println(arr[i]);

    }

//find max of an array using recursion
    public static int findMax(int arr[], int i){
        if(i==arr.length-1){
            return arr[i];
        }
      int misa = findMax(arr,i+1);
        if(misa>arr[i]) {
            return misa;
        }
            else{
                return arr[i];
            }
    }

// First Index of Occurence
    public static int firstOcc(int arr[], int i, int key){
        if(i==arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        } else {
            int foisa = firstOcc(arr, i+1, key);
            return foisa;
        }
    }

//    Last Index of Occurence
    public static int lastOcc(int arr[], int i, int key){
        if (i == arr.length){
            return -1;
        }
        int liisa = lastOcc(arr,i+1,key);
        if (liisa == -1){
            if(arr[i] == key){
                return i;
            }else {
                return -1;
            }
        } else {
            return liisa;
        }
    }
    public static void toh(int n, int t1d, int t2d, int t3d){
        if (n==0){
            return;
        }
        toh(n-1, t1d, t3d, t2d);
        System.out.println(n + "[ " + t1d + " -> " + t2d + " ]");
        toh(n-1, t3d, t2d, t1d);
    }

}
