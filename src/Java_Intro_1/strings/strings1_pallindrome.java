package Java_Intro_1.strings;
import java.util.*;

public class strings1_pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
//        String s = "abcd";
//        System.out.println(s.length());
//        for (int i = 0; i < s.length(); i++){
//            for (int j = i+1; j <=s.length(); j++){
//                System.out.println(s.substring(i, j));
//            }
//        }


//        Concatenation (to add)
//        String s1 = "hello";
//        String s2 = "world";
//        String s3 = s1 + " " + s2;
//        System.out.println(s3);

//        s1 += ' ';
//        s1 += 'w';
//        s1 += 'o';
//        System.out.println(s1);

//        System.out.println(s1 + 10 + 20);
//        System.out.println(10 + 20 + s1);

//        Split function of string
//        String s = "abc def ghi jkl mnop";
//        String[] parts = s.split(" ");
//        for (int i = 0; i < parts.length; i++){
//            System.out.println(parts[i]);
//        }

//        print all palindromic substring
        String str = sc.next();
        Solution(str);

    }

    public static void Solution(String str){
        for (int i = 0; i < str.length(); i++){
            for (int j = i+1; j <= str.length(); j++){
               String ss = str.substring(i, j);
                if (isPallindrome(ss)){
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPallindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i <= j){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if (ch1 != ch2){
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;

    }
}
