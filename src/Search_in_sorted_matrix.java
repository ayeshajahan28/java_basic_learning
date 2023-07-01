public class Search_in_sorted_matrix {

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;

        while (row <= matrix.length-1 && col >=0){
            if (matrix[row][col] == key){
                System.out.println("key found at index (" + row + "," + col + ")");
             return true;
            }
            else if (key < matrix[row][col]){
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    // Q: find out the frequency of a given no. in a matrix
    public static int countFrequency(int matrix[][], int key){
        int count = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumSecondRow (int matrix[][]){
        int sum = 0;
        for (int i=1, j=0; j<matrix[0].length; j++){
            sum += matrix[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
    int matrix[][] = {{10, 20, 30, 40},
                      {15, 29, 35, 45},
                      {27, 29, 27, 48},
                      {32, 33, 39, 50},};

    int key = 27;
        System.out.println(sumSecondRow(matrix));
    }
}