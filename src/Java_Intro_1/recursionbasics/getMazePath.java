package Java_Intro_1.recursionbasics;
import java.util.*;

public class getMazePath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dr = sc.nextInt();
        int dc = sc.nextInt();
        ArrayList<String> paths = getMP(1, 1, dr, dc);
        System.out.println(paths);
    }

    public static ArrayList<String> getMP(int sr, int sc, int dr, int dc) {
        if (sr==dr && sc ==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();         //first declare hpaths and vpaths
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc < dc) {
            hpaths = getMP(sr, sc + 1, dr, dc);
        }
        if (sr < dr) {
            vpaths = getMP(sr + 1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String hpath : hpaths) {
            paths.add("h" + hpath);
        }
        for (String vpath : vpaths) {
            paths.add("v" + vpath);
        }
        return paths;
    }
}
