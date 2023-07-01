public class Ooops8_static {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.schoolName = "JMV";

        Student2 s2 = new Student2();
        System.out.println(s2.schoolName);

        Student2 s3 = new Student2();
        s3.schoolName = "ABC";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName);

        Parrot p = new Parrot();
        System.out.println(p.color);

    }
}
    class Student2{
        String name;
        int roll;
        static String schoolName;

        void setName (String name){
            this.name = name;
        }
        String getName (){
            return this.name;
        }
    }


    //Super keyword ---> refers to immediate parent
    class Bird{
    String color;
    Bird(){
        System.out.println("Bird constructor is called");
    }
    }
    class Parrot extends Bird{
    Parrot(){
        super();  //super means imm parent, and if super not written then by default, Java calls super constructor
        super.color = "Brown";
        System.out.println("Parrot constructor is called");
    }
    }

