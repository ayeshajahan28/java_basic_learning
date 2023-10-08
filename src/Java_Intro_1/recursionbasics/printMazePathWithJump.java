package Java_Intro_1.recursionbasics;
import java.util.*;

public class printMazePathWithJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        printMPWJ(1, 1, dr, dc, "");
    }

    public static void printMPWJ(int sr, int sc, int dr, int dc, String paths) {
        if (sr==dr && sc==dc){
            System.out.println(paths);
            return;
        }

        //Horizontal path
        for (int ms = 1; ms <= dc - sc; ms++) {
            printMPWJ(sr, sc + ms, dr, dc, paths + "h" + ms);
        }
        // Vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            printMPWJ(sr + ms, sc, dr, dc, paths + "v" + ms);
        }
//        Diagonal moves
        for (int ms = 1; ms <= dc - sc && ms <= dr - sr; ms++) {
            printMPWJ(sr + ms, sc + ms, dr, dc, paths + "d" + ms);
        }
    }
}