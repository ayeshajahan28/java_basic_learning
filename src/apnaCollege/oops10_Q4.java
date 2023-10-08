package apnaCollege;

public class oops10_Q4 {
    public static void main(String[] args) {
        Ayezah as = new Ayezah();
// Static(parent) --> Static(child) --> Non static(p) --> Cons(p) --> Non Static(c) --> Cons(c)

        as.eat();
    }
}

class Sharique{
    static {
        System.out.println("Ayesha");
    }
    {
        System.out.println("apnaCollege.Ayezah");
    }
    Sharique(){
        System.out.println("Aliyana");
    }
    void eat(){
        System.out.println("eats only non veg");
    }
}

class Ayezah extends Sharique{
    Ayezah (){
        System.out.println("Open Birla");
    }
    static {
        System.out.println("Maa");
    }
    {
        System.out.println("Dady");
    }
}