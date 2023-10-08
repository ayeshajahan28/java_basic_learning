package Java_Intro_1.recursionbasics;

public class RecursionBasics {
//print numbers in decreasing order
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);

    }
//print numbers in increasing order
    public static void printInc(int n){
      if (n==1){
          System.out.print(n + " ");
          return;
      }
        printInc(n-1);
        System.out.print(n + " ");
    }
//find factorial of N
    public static int fact(int n){
        if (n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
//print sum of N natural numbers
    public static int printSum(int n){
        if (n==1){
            return 1;
        }
        int snm1 = printSum(n-1);
        int sn = n + snm1;
        return sn;
    }
//print Nth Fibonacci number --> fibonacci number is the sum of its immediate previous 2 numbers|TC=O(2^n)|SC=O(n)
    public static int fib(int n){
        if (n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
//check if array is sorted or not       // TC-> O(n)   SC = O(n)
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
//First Occurence   TC = O(n) | SC = O(n)
    public static int firstOcc(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(fact(5));
        System.out.println(printSum(5));
        System.out.println(fib(5));

//        int arr[] = {1, 2, 3, 4};
//        System.out.println(isSorted(arr,0));

        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println("Key is at index no: " + firstOcc(arr, 5, 0));

        printDec(n);
        printInc(n);

    }

}
