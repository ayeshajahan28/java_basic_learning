package Java_Intro_1.patterns;
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pattern 1#
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Pattern 2#
//        int n = sc.nextInt();
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

        //Pattern 3
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i; j++){
//                System.out.print("\t");
//            } for (int j = 1; j <= i; j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

        //Pattern 4
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= i-1; j++){
//                System.out.print("\t");
//            }
//            for (int j = 1; j <= n-i+1; j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }

//        Pattern 5   --> solution a
//        int n = sc.nextInt();    //n = 3
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("\t");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//                for (int i = n-1; i >= 1; i--) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("\t");
//            }
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//        Pattern 5 --> solution b
//        int n = sc.nextInt();
//        int sp = n/2;
//        int st = 1;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= sp; j++){
//                System.out.print("\t");
//            }
//            for (int j = 1; j <= st; j++){
//                System.out.print("*\t");
//            }
//            if (i <= n/2){
//                sp--;
//                st += 2;
//            } else {
//                sp++;
//                st -= 2;
//            }
//            System.out.println();
//        }
//        Pattern 6 --> a
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n-i+1; j++){
//                System.out.print("*\t");
//            } for (int j = 1; j <= 2*i-1; j++){
//                System.out.print("\t");
//            }
//             for (int j = 1; j <= n-i+1; j++){
//                 System.out.print("*\t");
//             }
//            System.out.println();
//        }
//        for (int i = n-1; i >= 1; i--){
//            for (int j = 1; j <= n-i+1; j++){
//                System.out.print("*\t");
//            } for (int j = 1; j <= 2*i-1; j++){
//                System.out.print("\t");
//            }
//            for (int j = 1; j <= n-i+1; j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//        Pattern 6 --> b
//        int n = sc.nextInt();
//       int st = n/2 + 1;
//       int sp = 1;
//       for (int i = 1; i <= n; i++){
//           for (int j = 1; j<= st; j++){
//               System.out.print("*\t");
//           }
//           for (int j = 1; j <= sp; j++){
//               System.out.print("\t");
//           }
//           for (int j = 1; j<= st; j++){
//               System.out.print("*\t");
//           }
//           if(i <= n/2){
//               st--;
//               sp += 2;
//           } else{
//               st++;
//               sp -= 2;
//           }
//           System.out.println();
//       }

//        Pattern 7 --> a
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j<= i-1; j++){
//                System.out.print("\t");
//            }
//            System.out.print("*");
//            System.out.println();
//        }
//        Pattern 7 --> b
//        int n = sc.nextInt();
//        int sp = 0;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= sp; j++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            sp++;
//            System.out.println();
//        }
//        Pattern 7 --> c
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++) {
//                if (i == j) {
//                    System.out.print("*\t");
//                } else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 8 --> a\
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (i+j == n + 1){
//                    System.out.print("*\t");
//                } else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 9
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if ( i == j || i+j == n + 1){
//                    System.out.print("*\t");
//                } else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }

//        Pattern 10 - Hollow Diamond -- a
//        int n = sc.nextInt();
//        int os = n/2;
//        int is = -1;
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= os; j++){
//                System.out.print("\t");
//            }
//            System.out.print("*\t");
//            for (int j = 1; j <= is; j++){
//                System.out.print("\t");
//            }
//            if (i > 1 && i < n){
//                System.out.print("*\t");
//            }
//            if (i <= n/2){
//                os--;
//                is += 2;
//            } else {
//                os++;
//                is -= 2;
//            }
//            System.out.println();
//       }

        //        Pattern 11 - Half pyramid with nos.
//        int n = sc.nextInt();
//        int val = 1;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(val + "\t");
//                val++;
//            }
//            System.out.println();
//        }

//        Pattern 12 - Right angled triangle + fibonacci series
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//       for (int i = 1; i <= n; i++){
//           for (int j = 1; j <= i; j++){
//               System.out.print(a + "\t");
//               int c = a + b;
//               a = b;
//               b = c;
//           }
//           System.out.println();
//       }

//        Pattern 13 -- Right angled triangle + combination formula

//        int n = sc.nextInt();
//         for (int i = 0; i < n; i++){
//             int icj = 1;
//             for (int j = 0; j <= i; j++){
//                 System.out.print(icj + "\t");
//                 int icjp1 = icj * (i - j)/(j+1);
//                 icj = icjp1;
//             }
//             System.out.println();
//         }

//        Pattern 14 - Table
//        int x = sc.nextInt();
//        for (int i = 1; i <= 10; i++){
//                System.out.println(x + " * " + i + " = " + x * i);
//            }

//        Pattern 15
        int n = sc.nextInt();
        int sp = n/2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            int cval = val;
            for (int j = 1; j <= st; j++){
                System.out.print(cval + "\t");
                if (j <= st/2){
                    cval++;
                } else {
                    cval--;
                }
            }
            if (i <= n/2){
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }
            System.out.println();
        }
        }
}