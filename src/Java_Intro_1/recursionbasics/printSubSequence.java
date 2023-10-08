package Java_Intro_1.recursionbasics;
import java.util.*;

public class printSubSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.next();
        printSS(ques,"");
    }
   public static void printSS(String ques, String ans){
        if (ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans + ch);
        printSS(roq, ans + "");
   }
}
