package Java_Intro_1.recursionbasics;
import java.util.*;

public class getMazePathJump {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int dr = sc.nextInt();
    int dc = sc.nextInt();
    ArrayList<String> paths = getMPJ(1, 1, dr, dc);
        System.out.println(paths);
    }

    public static ArrayList<String> getMPJ(int sr, int sc, int dr, int dc){
        if (sr==dr && sc ==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();
        //horizontal moves
        for (int ms = 1; ms <= dc-sc; ms++){
            ArrayList<String> hpaths = getMPJ(sr, sc+ms, dr, dc);
            for (String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }
        //vertical moves
        for (int ms = 1; ms <= dr-sr; ms++){
            ArrayList<String> vpaths = getMPJ(sr+ms, sc, dr, dc);
            for (String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }
        //diagonal moves
        for (int ms = 1; ms<= dr-sr && ms <= dc-sc; ms++){
            ArrayList<String> dpaths = getMPJ(sr+ms, sc+ms, dr, dc);
            for (String dpath : dpaths){
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}

