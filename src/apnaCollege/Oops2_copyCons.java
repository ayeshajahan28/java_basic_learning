package apnaCollege;

public class Oops2_copyCons {
    public static void main(String[] args) {
    Studentz s1 = new Studentz();
    s1.name = "Ayesha";
    s1.roll = 123;
    s1.password = "abcd";
    s1.marks[0] = 100;
    s1.marks[1] = 90;
    s1.marks[2] = 80;

    Studentz s2 = new Studentz(s1);
    s2.password = "xyz";

    s1.marks[2] = 100;

    for (int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }
    }

}

class Studentz {
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    Studentz (Studentz s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

    }
    Studentz(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    }


