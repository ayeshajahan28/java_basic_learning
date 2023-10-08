package apnaCollege;

public class Oops6 {

    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
// apnaCollege.Animal2 a = new apnaCollege.Animal2(); - we cannot create an object for abstract class but we can create constructors

    }
}

abstract class Animal2{
    String color;
    Animal2(){
        System.out.println("animal constructor is called");
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

  class Horse extends Animal2 {
    Horse(){
        System.out.println("horse constructor is called");
    }
    void changeColor(){
        color = "dark brown";
    }
  void walk(){
        System.out.println("walks on 4 legs");
  }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("mustang constructor is called");
    }
}
   class Chicken extends Animal2 {
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
   }
