package Java_Intro_1.recursionbasics;
import java.util.*;
public class getSubSequence_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res =  gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str){
        if (str.length() ==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);                   //a
        String ros = str.substring(1);    //bc
        ArrayList<String> rres = gss(ros);         // recursion call (faith) [--, -c, b-, bc]

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres){
            mres.add("" + rstr);
        }

        for (String rstr : rres){
            mres.add(ch + rstr);
        }
        return mres;

    }
}
