package apnaCollege;

import java.util.*;
public class Array2D {

    // How to search a given cell in matrix.
    public static boolean search(int matrix[][], int key){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == key){
                    System.out.println("Key found at index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    // How to search the largest and smallest number in a matrix.
    public static void searchLS(int matrix[][]){
        int largest = Integer.MIN_VALUE;
       int smallest = Integer.MAX_VALUE;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                largest = Math.max(matrix[i][j], largest);
                smallest = Math.min(matrix[i][j], smallest);
            }
        }
        System.out.println("The largest no. is: " + largest);
        System.out.println("The smallest no. is: " + smallest);
    }

    public static void main(String[] args){
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        //input
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchLS(matrix);
    }
}
