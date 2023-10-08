package Java_Intro_1.recursionbasics;
import java.util.*;

public class printKeypadCombination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.next();
        printKPC(ques, "");
    }
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String ques, String ans){
        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String codesforch = codes[ch-'0'];
        for (int i=0; i<codesforch.length(); i++){
            char chcode = codesforch.charAt(i);
            printKPC(roq, ans + chcode);
        }

    }
}
