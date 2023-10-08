package apnaCollege;

public class Oops4 {
    public static void main(String[] args) {
//        Fish shark = new Fish();
//        shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);


        Students s1 = new Students();
        s1.name = "Ayesha";
        s1.roll = 23;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Students s2 = new Students(s1); //we have copied in this stmt but after this we are changing marks of s1
        s2.password = "xyz";
        s1.marks[2] = 48;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
    }

    class Students{
        String name;
        int roll;
        String password;
        int marks[];

        //shallow copy constructor
//        apnaCollege.Students(apnaCollege.Students s1){
//            marks = new int[3];
//            this.name = s1.name;
//            this.roll = s1.roll;
//            this.marks = s1.marks;
//        }

        //deep copy constructor
        Students(Students s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for (int i=0; i<3; i++){
                this.marks[i] = s1.marks[i];
            }
        }
        Students (){
            System.out.println("s1 is the student 1");
            marks = new int[3];
        }
        Students(String name){
            this.name = name;
            marks = new int[3];
        }
        Students(int roll){
            this.roll = roll;
            marks = new int[3];  //copy this stmt in each so that each constrctr will ensure that marks will store only 3 sub marks
        }
    }
//Base class/Parent Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
    //derived class/subclass/child class
//class Fish extends apnaCollege.Animal{
//    int fins;
//    void swim(){
//        System.out.println("swims in water");
//    }
//}

class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
