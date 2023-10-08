package Java_Intro_1.recursionbasics;
import java.util.*;

public class printMazePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        printMP(1,1,dr, dc, "");
    }
    public static void printMP(int sr, int sc, int dr, int dc, String paths){

        if (sr>dr || sc>dc){
            return;
        }
        if (sr==dr && sc==dc){
            System.out.println(paths);
            return;
        }

        printMP(sr, sc+1, dr, dc, paths + "h");
        printMP(sr+1, sc, dr, dc, paths + "v");
    }
}
