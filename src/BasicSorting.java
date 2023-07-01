import java.util.*;
public class BasicSorting {
    // Bubble Sort
    public static void bubbleSort(int arr[]){
        for (int turn=0; turn<arr.length-1; turn++){
            for (int j=0; j<arr.length-1-turn; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr [j];
                    arr[j] = arr [j+1];
                    arr [j+1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int minPos = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr [minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]<temp){
                arr[j+1] = arr[j];
                j--;
            }
           arr[j+1] = temp;
        }
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j=0;
        for (int i=0; i<count.length; i++){
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] ={3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        insertionSort(arr);
        printArray(arr);
    }
}
