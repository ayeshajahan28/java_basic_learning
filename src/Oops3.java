public class Oops3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ayesha");
        System.out.println(e1.name);
        Employee e3 = new Employee(23);
        System.out.println(e3.empId);
        //Employee e4 = new Employee("Rehan", 24) ->error coz no constructor exist with 1st string and 2nd empId parameter

    }
}

class Employee {

    String name;
    int empId;

    Employee(){                        //non parameterized constructor

        System.out.println("Constructor is called..");
    }
    Employee(String name){        //parameterized constructor
        this.name = name;         //initializing name with name value in this Employee named object
    }
    Employee(int empId){

        this.empId = empId;
    }

}
