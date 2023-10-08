package Java_Intro_1.recursionbasics;
import java.util.*;

public class printPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ques = sc.next();
        printPer(ques, "");
    }
    public static void printPer(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        for (int i=0; i<ques.length(); i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0, i);
            String qrpart = ques.substring(i+1);
            String roq = qlpart + qrpart;
            printPer(roq, ans + ch);
        }
    }
}
