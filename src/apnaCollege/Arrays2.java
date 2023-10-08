package apnaCollege;

import java.util.*;

public class Arrays2 {
    // find a no. in a given array, through calling function

//    public static int linearSearch (int numbers [], int key) {
//        for (int i=0; i<numbers.length; i++){
//            if (numbers[i] == key){
//                return i;
//            }
//            } return -1;
//        }
//    public static void main(String[] args) {
//        int numbers [] = {23, 21, 20, 67, 98, 0, 89, 65, 7, 37 };
//        int key = 89;
//        int index = linearSearch(numbers, key);
//        if (index == -1) {
//            System.out.println("Not found");
//        }else {
//        System.out.println("The key is at index: " + index);
//    }
//    }
    // Largest in Array

//    public static int largest (int numbers []){
//        int largest = Integer.MIN_VALUE;       // - infinity --> smallest no.
//        int smallest = Integer.MAX_VALUE;      // + infinity  --> largest no.
//        for (int i=0; i<numbers.length; i++){
//            if (largest < numbers [i]){
//                largest = numbers [i];
//            }
//            if (smallest > numbers [i]){
//                smallest = numbers [i];
//            }
//        }
//        System.out.println("The smallest no. in the array is:" + smallest);
//        return largest;
//    }
//    public static void main(String[] args) {
//        int numbers [] = { 4, 6, 3, 8, 9, 1};
//        System.out.println("The largest no. in the array is: " + largest(numbers));
//    }

    // Binary Search

//    public static int binarySearch (int numbers [], int key){
//        int start = 0, end = numbers.length-1;
//        while (start <= end){
//            int mid = (start + end)/2;
//            if (numbers [mid] == key){
//                return mid;
//            } if (numbers [mid] < key){
//                start = mid + 1;
//            } if (numbers [mid] > key){
//                end = mid -1;
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        int numbers [] = {2, 4, 6, 10, 12, 14, 16, 18};
//        int key = 16;
//        System.out.println("Key is found at index: " + binarySearch(numbers, key));
//    }

    // Reverse an array

//    public static void reverseArray (int numbers []) {
//        int first = 0, last = numbers.length - 1;
//        while (first < last) {
//            // swap
//            int temp = numbers[last];
//            numbers[last] = numbers[first];
//            numbers[first] = temp;
//
//            first++;
//            last--;
//        }
//    }
//    public static void main(String[] args) {
//        int numbers [] = {2, 4, 6, 8, 10, 12};
//        reverseArray(numbers);
//        for (int i=0; i<numbers.length; i++){
//            System.out.print(numbers [i] + " ");
//        }
//        System.out.println();
//    }

    // Pairs in Array
//    public static void printPairs (int numbers []){
//        int tp = 0;
//        for (int i=0; i<numbers.length; i++){
//            int curr = numbers [i];
//            for (int j=i+1; j<numbers.length; j++){
//                System.out.print( "(" + curr+ "," + numbers [j] + ")" );
//                tp++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total no.  of pairs are:" + tp);
//    }
//    public static void main(String[] args) {
//        int numbers [] = {2, 4, 6, 8, 10};
//        printPairs(numbers);
//    }

    // Print subarrays

//    public static void printSubarrays(int numbers[]) {
//        int tsa = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j <numbers.length; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(numbers[k] + " ");
//                }
//                System.out.println();
//                tsa++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total no. of subarrays are: " + tsa);
//    }
//    public static void main(String[] args) {
//      int numbers [] = {2, 4, 6, 8, 10};
//     printSubarrays(numbers);
//    }

    // Print sum of all subarrays and find max and min - Brute force
//    public static void printMaxSubarraysSum(int numbers[]) {
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i; j <numbers.length; j++) {
//                currSum = 0;
//                for (int k = i; k <= j; k++) {
//                    currSum += numbers [k];
//                    }
//                System.out.println(currSum);
//                if (currSum > maxSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Max sum od subarrays is: " + maxSum);
//    }
//    public static void main(String[] args) {
//        int numbers [] = {2, 4, 6, 8, 10};
//        printMaxSubarraysSum(numbers);
//    }

    // Print sum of all subarrays and find max and min - Prefix Sum
//    public static void printSubarraysSum (int numbers []){
//        int currSum = 0;
//        int maxSum = Integer.MIN_VALUE;
//        int prefix [] = new int [numbers.length];
//        prefix [0] = numbers [0];
//        for (int i=1; i<prefix.length; i++){
//            prefix [i] = prefix [i-1] + numbers [i];
//        }
//        for (int i=0; i<numbers.length; i++){
//            for (int j=0; j<numbers.length; j++){
//                currSum = i == 0 ? prefix [j] : prefix [j] - prefix [i-1];
//
//                if (currSum > maxSum){
//                    maxSum = currSum;
//                }
//            }
//        }
//        System.out.println("Max subarray sum is: " + maxSum);
//    }
//
//    public static void main(String[] args) {
//        int numbers [] = {1, -2, 6, -1 ,3 };
//        printSubarraysSum(numbers);
//    }

    // Max sum of subarrays: Kadanes Algorithm

//    public static void maxSubarraysSum(int numbers[]) {
//        int maxSum = Integer.MIN_VALUE;
//        int currSum = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            currSum = currSum + numbers[i];
//            if (currSum < 0) {
//                currSum = 0;
//            }
//            maxSum = Math.max(currSum, maxSum);
//        }
//        System.out.println("The max sum of subarrays is: " + maxSum);
//    }
//    public static void main(String[] args) {
//       int numbers [] = {4, -2, -3, 3, 4, 1};
//       maxSubarraysSum(numbers);
//    }

    // Trapped Rainwater -- DSA -- #22

//    public static int trappedRainwater(int height[]){
//        // Calculate left max boundary - Auxillary Array
//        int n = height.length;
//        int leftMax[] = new int [n];
//        leftMax[0] = height[0];
//        for (int i=1; i<n; i++){
//            leftMax[i] = Math.max(leftMax[i-1], height[i]);
//        }
//        // Calculate right max boundary
//        int rightMax[] = new int [n];
//        rightMax[n-1] = height [n-1];
//        for (int i=n-2; i>=0; i--){
//            rightMax[i] = Math.max(rightMax[i+1], height[i]);
//        }
//        // Calculate water level and trapped water
//        int trappedWater = 0;
//        for (int i=0; i<n; i++){
//            int waterLevel = Math.min(leftMax[i], rightMax[i]);
//            trappedWater += (waterLevel - height[i]);
//        }
//        return trappedWater;
//    }
//    public static void main(String[] args) {
//        int height[] = {4, 2, 0, 6, 3, 2, 5};
//        System.out.println(trappedRainwater(height));
//    }

    // Buy and Sell Stocks - A

//    public static int buyAndSellStocks (int prices[]){
//        int buyPrice = Integer.MAX_VALUE;
//        int maxProfit = 0;
//
//        for (int i=0; i<prices.length; i++){
//            if (buyPrice > prices[i]){
//                buyPrice = prices[i];
//            } else {
//                int profit = prices[i] - buyPrice;
//                maxProfit = Math.max(maxProfit, profit);
//            }
//        }
//        return maxProfit;
//    }
//    public static void main(String[] args) {
//        int prices[] = {7, 2, 5, 3, 6, 1};
//        System.out.println(buyAndSellStocks(prices));
//    }

    // contains Duplicate values - DSA Sheet #4

    public static boolean containsDuplicate (int numbers[]){
    for (int i=0; i<numbers.length-1; i++){
        for (int j=i+1; j<numbers.length; j++){
            if (numbers[i] == numbers[j]){
                return true;
            }
            }
        }
    return false;
}
//    public static void main(String[] args) {
//        int numbers[] = {1, 2, 3, 1};
//        System.out.println(containsDuplicate(numbers));
//    }

    // Buy and Sell Stocks - B
    public static int buyAndSellStocks (int prices[]){
        int n = prices.length;
        int arr[] = new int [n];
        arr[n-1] = prices[n-1];
        int maxProfit = Integer.MIN_VALUE;

        for (int i=n-2; i>=0; i--) {
            arr[i] = Math.max(prices[i], arr[i + 1]);
            int Profit = arr[i] - prices[i];
            maxProfit = Math.max(Profit, maxProfit);
        }
        return maxProfit;
    }
//    public static void main(String[] args) {
//        int prices[] = {7, 2, 1, 4, 6, 1};
//        System.out.println(buyAndSellStocks(prices));
//    }


}

