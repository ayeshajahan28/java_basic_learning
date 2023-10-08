package Java_Intro_1.array;
import java.util.*;
public class arrayApnaCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        int key = sc.nextInt();
//        System.out.println(binarySearch(arr, key));
//          reverseArray(arr);
//          for (int i = 0; i < arr.length; i++){
//              System.out.print(arr[i] + ", ");
//          }
//          printPairs(arr);
//        printSubArrays(arr);
//        printMaxSubArray(arr);
//        maxSubArrayPrefixSum(arr);
        System.out.println(kadanesMaxSubSum(arr));
    }


//    Binary Search
    public static int binarySearch(int [] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == key){
                return mid;
            } if (arr[mid] < key){
                start = mid + 1;
            } else {
                end = mid - 1;
        }
    }
        return -1;
}

//  Reverse an array
    public static void reverseArray(int [] arr){
        int first = 0, last = arr.length - 1;
        while (first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

//     Pairs in an array
    public static void printPairs(int [] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                System.out.print( "(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

//     Print sub arrays
      public static void printSubArrays(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k] + " ");
                    }
                System.out.println();
                }
            System.out.println();
            }
        }


    //     Print max sub arrays  - Brute force - TC = O(n^3)
    public static void printMaxSubArray(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int currSum = 0;
                for (int k = i; k <= j; k++){
                    currSum += arr[k];
                    }
                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is: " + maxSum);
    }


    //     Print max sub arrays  - Prefix Sum - TC = O(n^2)
    public static void maxSubArrayPrefixSum(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        int [] prefix = new int[arr.length];
        prefix [0] = arr[0];
        for (int i = 1; i < prefix.length; i++){
                  prefix[i] = prefix[i-1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                
               int currSum = i == 0? prefix[j] : prefix[j] - prefix[i-1];
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is: " + maxSum);

    }

    //     Print max sub arrays  - Kadane's Algorithm - TC = O(n)
    public static int kadanesMaxSubSum(int [] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if (currSum < 0){
                currSum = 0;
            }
           maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
