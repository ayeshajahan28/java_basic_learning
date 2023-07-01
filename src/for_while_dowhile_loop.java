import java.util.*;

public class for_while_dowhile_loop {
    public static void main(String[] args) {
//       for (int counter = 0; counter < 11; counter = counter + 1){
//           System.out.println(counter);
//       }


//        int i = 0;
//        while (i <11){
//          System.out.println(i);
//          i = i + 1;
//        }


//        int i = 0;
//     do {
//         System.out.println(i);
//         i = i + 1;
//    } while (i < 11);


//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++){
//            sum = sum + i;
//        } System.out.println(sum);
//
//    }
//         Scanner sc = new Scanner (System.in);
//         int n = sc.nextInt();
//
//         for (int i = 1; i <= 10; i++){
//             System.out.println(n*i);
//         }

//
//        Scanner sc = new Scanner (System.in);
//        int n = sc.nextInt();
//
//        for(int i = 1; i <= n; i++){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }


        Scanner sc = new Scanner(System.in);
        int input;

        do {
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is good");
            } else if (marks >= 60 && marks <= 89) {
                System.out.println("This is also good");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("This is good as well");
            } else {
                System.out.println("Invalid");
            }
            System.out.println("Want to continue ? (yes(1) or no(0))");
            input= sc.nextInt();

        } while (input==1);

//       Scanner sc = new Scanner (System.in);
//       int n = sc.nextInt();
//
//       boolean isPrime = true;
//       for (int i = 2; i <=n/2; i++){
//           if (n%i==0){
//               isPrime = false;
//               break;
//           }
//       }
//       if(isPrime){
//           if (n==1){
//               System.out.println("This is neither prime nor composite");
//           } else {
//               System.out.println("This is prime number");
//           }
//           }else {
//           System.out.println("This is not prime number");
       }
        }










