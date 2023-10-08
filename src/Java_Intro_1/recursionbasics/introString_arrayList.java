package Java_Intro_1.recursionbasics;
import java.util.*;

public class introString_arrayList {

    public static void main(String[] args) {
//        String Intro
        String str = "hello";
        System.out.println(str);
        char ch = str.charAt(0);
        System.out.println(ch);
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        String ss = str.substring(2, 4);
        System.out.println(ss);

//        ArrayList Intro
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list + " -> " + list.size());

//        for(int val : list){
//            System.out.println(val);
//        }
        for (int i=0; i<list.size(); i++){
            int val = list.get(i);
            System.out.println(val);
        }
        list.set(2, 300);                               //only change in value, size remains same
        System.out.println(list + " -> " + list.size());
        list.add(2, 3000);                 //insert and increase size
        System.out.println(list + " -> " + list.size());
    }
}
