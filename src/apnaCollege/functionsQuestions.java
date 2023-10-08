package apnaCollege;

import java.util.*;
public class functionsQuestions {
    // Sum of 2 nos

//    public static int calculateSum (int a, int b) {
//        int sum = a + b;
//        return sum;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSum(a, b);
//        System.out.println(sum);
//    }

    // Product of 2 nos. (1)
//    public static int calculateProduct(int a, int b){
//
//        return a*b;
//    }
//    public static void main(String [] args){
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("The product of the 2 numbers are: " + calculateProduct(a, b));
//
//    }


    // Product of 2 nos. (2)

//    public static void printProduct (int a, int b){
//        int product = a*b;
//        System.out.println(product);
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        printProduct(a, b);


    // Factorial of a number

//    public static void printFactorial(int n){
//        if (n < 0){
//            System.out.println("Invalid Number");
//            return;
//        }
//        int factorial = 1;
//        for (int i=n; i>=1; i--){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        int n = sc.nextInt();
//        printFactorial(n);
//    }

// Number is prime or not (a)

//    public static void checkPrime(int n) {
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                System.out.println("This is not a prime no.");
//                return;
//            } else {
//                System.out.println("This is a prime no.");
//                return;
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        checkPrime(n);
//    }

    // Check prime (b)
//    public static boolean isPrime (int n){
//        for (int i=2; i<=n/2; i++){
//            if (n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        if (isPrime(n)==false){
//            System.out.println("Not a prime no.");
//        } else if (isPrime(n)==true){
//            System.out.println("Prime no.");
//        } else {
//            System.out.println("Invalid no.");
//        }
//    }

    // Check if a number is even or not
//    public static boolean checkEvenOdd(int n){
//        if (n%2==0){
//            System.out.println("Even");
//        } else {
//            System.out.println("False");
//        }
//        return true;
//    }
//    public static void main (String[] args){
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        checkEvenOdd(n);
//    }

    // Print a table
//    public static void printTable(int n){
//        for (int i=1; i <=10; i++){
//            System.out.println(n*i);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//        printTable(n);
//    }

    // Print average of 3 nos.

//    public static void printAverage (int a, int b, int c){
//        float average = (a+b+c)/3;
//        System.out.println(average);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        printAverage(a,b, c);
//    }

    // Print sum of all odd nos. from 1 to n

//    public static void printSumOdd1toN (int n){
//        int sum = 0;
//        for (int i=1; i<=n; i++){
//            if (i % 2 != 0){
//                sum = sum + i;
//            }
//        }
//        System.out.println(sum);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        int n = sc.nextInt();
//        printSumOdd1toN(n);
//    }

    // Return the greater of 2 nos. (a)

//    public static void returnGreater(int a, int b){
//        if (a>b){
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        returnGreater(a, b);
//    }

    // Return the greater of 2 nos. (b)

//    public static int getGreater(int a, int b){
//        if (a>b){
//            return a;
//        } else {
//            return b;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(getGreater(a, b));
//    }

    // Takes in radius and returns the circumference of a circle

//    public static Double getCircumference(Double radius){
//        return 2 * 3.14 * radius;
//    }
//    public static void main(String[] args) {
//      Scanner sc = new Scanner (System.in);
//      Double radius = sc.nextDouble();
//        System.out.println(getCircumference(radius));
//    }

    // Takes age and returns whether person can vote (>18) (a)
//    public static int getVoteEligibility (int age){
//        if (age>18){
//            System.out.println("Vote");
//        } else {
//            System.out.println("Cannot Vote");
//        }
//        return age;
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner (System.in);
//       int age = sc.nextInt();
//       getVoteEligibility(age);
//    }

//    public static boolean isEligibility (int age){
//        if (age>18){
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int age = sc.nextInt();
//        System.out.println(isEligibility(age));
//    }

    // 6. Write infinite loop using do while condition
//    public static void main(String[] args) {
//
//        do {
//
//            }  while (true);
//        }


    // Write a program to enter the numbers till the user wants and at the end it should display
    // the count of positive, negative and zeros entered.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        int positives = 0; int negatives = 0; int zeroes = 0;
//        System.out.println("Press 1 to continue and 0 to stop");
//        int input = sc.nextInt();
//        while (input==1) {
//            System.out.println("Enter your number: ");
//            int number = sc.nextInt();
//            if (number > 0) {
//                positives++;
//            } else if (number < 0) {
//                negatives++;
//            } else {
//                zeroes++;
//            }
//            System.out.println("Press 1 to continue and 0 to stop");
//            input = sc.nextInt();
//        }
//        System.out.println("Positives: "+ positives);
//        System.out.println("Negatives: "+ negatives);
//        System.out.println("Zeroes+ "+ zeroes);
//    }

    // Two numbers are entered by the user, x and n.
    // Write a function to find the value of one number raised to the power of another i.e. xn.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//
//        System.out.println("Enter x");
//        int x = sc.nextInt();
//        System.out.println("Enter n");
//        int n = sc.nextInt();
//        int result = 1;
//        for (int i = 1; i<=n; i++){
//            result = result * x;
//        }
//        System.out.println("x to the power n is: " + result);
//    }

    // Write a function that calculates the Greatest Common Divisor of 2 numbers (a)

//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        System.out.println("Enter number 1");
//        int n1 = sc.nextInt();
//        System.out.println("Enter number 2");
//        int n2 = sc.nextInt();
//
//        while (n1 != n2){
//            if (n1>n2){
//                n1 = n1 - n2;
//            } else {
//                n2 = n2 - n1;
//            }
//        }
//        System.out.println("GCD is: " + n1);
//    }

    // Write a function that calculates the Greatest Common Divisor of 2 numbers (b)

//    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int gcd = 1;
//
//        for (int i=1; i<=a && i<=b; i++){
//            if (a%i==0 && b%i==0){
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);
//    }

    // print Fibonacci series of n terms where n is input by user

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int num = 0;
        for (int i = 1; i<=n; i++){
            num = num + i;
            System.out.println(num);
        }
    }
}



