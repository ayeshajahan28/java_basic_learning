package apnaCollege;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();             // creation of pen named object
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        //p1.setColor("Yellow");
        p1.color = "Yellow";  // here we didnt call function but directly used "=" to change color
        System.out.println(p1.color);

        BankAccount myAcc = new BankAccount(); //we have created myAcc named object
        myAcc.username = "ayeshajahan";
        myAcc.setPassword("@Sharik123"); // but we cannot access myAcc.password
        System.out.println(myAcc.username);
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){     //created a function to set password; public so we can access it

        password = pwd;
    }
}

class Pen{
    String color;             //property
    int tip;                  //property
    void setColor(String newColor){                         //function
        color = newColor;
    }
    void setTip(int newTip){                               //function
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
    void calcPercentage(int phy, int chem, int math){

        percentage = (phy + chem + math)/3;
    }
}



