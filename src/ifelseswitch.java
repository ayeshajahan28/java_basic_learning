import java.util.*;

public class ifelseswitch {
  public static void main (String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("Please enter first number");
      int a = sc.nextInt();
      System.out.println("Please enter second number");
      int b = sc.nextInt();
      System.out.println("Please enter type of calculation");
      String types = sc.next();
      if (types.equalsIgnoreCase("add")){
          int addition = a + b;
          System.out.println("sum is " + addition);
      } else if (types.equalsIgnoreCase("sub")){
          int substraction = a - b;
          System.out.println("Difference is " + substraction);
      } else if (types.equalsIgnoreCase("mul")) {
          int multiplication = a * b;
          System.out.println("Product is " + multiplication);
      } else if (types.equalsIgnoreCase("div")) {
          int division = a / b;
          System.out.println("Quotient is " + division);
      } else if (types.equalsIgnoreCase("mod")) {
          int modulo = a % b;
          System.out.println("Remainder is " + modulo);
      } else {
          System.out.println("Please enter valid command");

      }
    }
    }



