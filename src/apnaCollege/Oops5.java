package apnaCollege;

public class Oops5 {


    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.5, (float)2.3));
        System.out.println(calc.sum(1, 2, 3));

        Deer d = new Deer();
        d.eat();
    }
}

//compile Time Polymorphism - Method/Function Overloading
   class Calculator{
        int sum(int a, int b){
            return a + b;
        }
        float sum(float a, float b){
            return a + b;
        }
        int sum(int a, int b, int c){
            return a + b + c;
        }
    }

    //Run time Polymorphism - Method/Function Overriding
    class Animal1{
    void eat(){
        System.out.println("eats anything");
    }
    }
    class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}

