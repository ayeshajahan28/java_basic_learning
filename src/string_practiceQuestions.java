import java.sql.SQLOutput;
import java.util.*;
public class string_practiceQuestions {

    public static int countLowercaseVowels(String str){
        int count = 0;
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        //Question #1
//        Scanner sc = new Scanner (System.in);
//        String str = sc.nextLine();
//        System.out.println("Count of vowels is: " + countLowercaseVowels(str));


        //Question #2
//        String str = "Ayesha";
//        String str1 = "Sharique";
//        String str2 = "Ayesha";
//        System.out.println(str.equals(str1) + " " + str.equals(str2));

        //Question #3
//        String str = "ApnaCollege".replace("lege", "ort");
//        System.out.println(str);
//    }

        // Replace methods in String
//        String str = "This is demo";
//        System.out.println(str.replace("is", "was")); // Thwas was demo
//        System.out.println(str.replace("is(.)", "was")); // This is demo
//        System.out.println(str.replaceFirst("is", "was")); // Thwas is demo
//        System.out.println(str.replaceFirst("is(.)", "was"  )); // Thwasis demo
//        System.out.println(str.replaceFirst("is(.*)", "was"));  //Thwas
//        System.out.println(str.replaceAll("is", "was")); //Thwas was demo
//        System.out.println(str.replaceAll("is(.)", "was")); // Thwaswasdemo
//        System.out.println(str.replaceAll("is(.*)", "was")); //Thwas


        //compareTo Method
//        String s1 = "axuwfenfvkjeoefen";  //97
//        String s2 = "A";  //65
//        System.out.println(s1.compareTo(s2));

        //Concat & join & plus method
//        String s1 = "Deepak";
//        String s2 = "Java";
//        String s3 = "Teacher";
//
//        System.out.println(s1+s2);      //DeepakJava
//        System.out.println(10+20+s1);   //30Deepak
//        System.out.println(s1+10+20);   //Deepak1020
//        System.out.println(s1+20/10);   //Deepak2
//
//        System.out.println(s1.concat(s2)); //DeepakJava
//
//        System.out.println(String.join(";", s1, s2, s3));
//        System.out.println(String.join("/", s1, s2, s3));
//        System.out.println(String.join("/,.[]", s1, s2, s3));
//        System.out.println(String.join("zzzzz", s1, s2, s3));


        // subSequence & substring
        String s = "This is demo";
        System.out.println(s.subSequence(3,9));               //s is d
        System.out.println(s.substring(3));         // s is demo
        System.out.println(s.substring(3,11));               // s is dem
 }
}
