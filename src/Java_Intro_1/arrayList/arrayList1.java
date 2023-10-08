package Java_Intro_1.arrayList;
import java.util.*;

public class arrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + " -> " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        list.add(1, 500);                  //to insert
        System.out.println(list + " -> " + list.size());

        int val = list.get(1);                          //to get
        System.out.println(val);

        list.set(2, 550);
        System.out.println(list + " -> " + list.size());

        list.remove(1);
        System.out.println(list + " -> " + list.size());

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Hello");
        l2.add("Bello");
        l2.add("cello");
        System.out.println(l2 + " -> " + list.size());

//        for (int i = 0; i < list.size(); i++){
//            int val1 = list.get(i);
//            System.out.println(val1);
//        }
        for (int val1 : list){
            System.out.println(val1);
        }
        System.out.println(list);
    }
}
