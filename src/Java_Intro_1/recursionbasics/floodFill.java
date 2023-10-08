package Java_Intro_1.recursionbasics;
import java.util.*;

public class floodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
    }

    public static void floodfill(int[][] maze, int row, int col, String paths, boolean[][] visited){
        if (row<0 || col<0 || row==maze.length || col==maze[0].length
                || maze[row][col]==1 || visited[row][col]==true){
            return;
        }

        if(row==maze.length -1 && col==maze[0].length -1){
            System.out.println(paths);
            return;
        }

        visited[row][col] = true;
        floodfill(maze, row-1, col, paths + "t", visited);
        floodfill(maze, row, col-1, paths + "l", visited);
        floodfill(maze, row+1, col, paths + "d", visited);
        floodfill(maze, row, col+1, paths + "r", visited);
        visited[row][col] = false;
}
}