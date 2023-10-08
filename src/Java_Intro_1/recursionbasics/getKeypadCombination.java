package Java_Intro_1.recursionbasics;
import java.util.*;

public class getKeypadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();                        //678
        ArrayList<String> res = getKPC(str);
        System.out.println(res);

    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str){
        if (str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);                       //6
        String ros = str.substring(1);        //78

        ArrayList<String> rres = getKPC(ros);          //recursive call on 78 - faith    -- 6 words list
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];            //6 -> pqrs
        for (int i=0; i<codeforch.length(); i++){
            char chcode = codeforch.charAt(i);
            for (String rstr : rres){
                mres.add(chcode + rstr);
            }
        }
        return mres;
    }
}
