package apnaCollege;

import java.util.*;

public class Pattern_basic {
    public static void main(String[] args) {
        // 1 --> solid rectangle
//        int n = 4;
//        int m = 5;
//        for (int i = 1; i <=n;i++){
//            for (int j = 1; j <= m; j++){
//                System.out.print("*");
//            }
//            System.out.println();

     // 2 --> hollow rectangle
//        int n = 4;
//        int m = 5;
//
//        for (int i=1; i<=n;i++) {
//          for (int j=1; j<=m; j++){
//              if (i==1 || j==1 || i==n || j==m ){
//                  System.out.print("*");
//              } else {
//                  System.out.print(" ");
//              }
//          }
//            System.out.println();

      // 3 --> Half pyramid

//        int n = 4;
//
//        for (int i=1; i<=4; i++){
//            for (int j=1; j<=i; j++ ){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 4 --> Inverted Half pyramid
//         int n = 4;
//
//         for (int i=n; i>=1; i--){
//             for (int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

         // 5 --> Inverted Half Pyramid (rotated by 180 degree)
//          int n = 4;
//
//          for (int i=1; i<=n; i++){
//              for (int j=1; j<=n-i; j++){
//                  System.out.print(" ");
//              } for (int j=1; j<=i; j++){
//                  System.out.print("*");
//              }
//              System.out.println();
//          }


        // 6 --> Half Pyramid with numbers
//          int n =5;
//
//          for (int i=1; i<=n; i++){
//              for (int j=1; j<=i; j++){
//                  System.out.print(j+" ");
//              }
//              System.out.println();
//          }


          // 7a--> Inverted Half Pyramid with Numbers
//           int n =5;
//
//           for (int i=n; i>=1; i--){
//               for (int j=1; j<=i; j++){
//                   System.out.print(j+" ");
//               }
//               System.out.println();
//           }


//           // 7b --> Inverted Half Pyramid with Numbers
//              int n = 5;
//
//              for (int i=1; i<=n; i++){
//                  for (int j=1; j<=n-i+1; j++){
//                      System.out.print(j+ " ");
//                  }
//                  System.out.println();
//              }


        // 8 --> Floyd's Triangle
//        int n = 5;
//        int number = 1;
//
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(number+ " ");
//                number++;
//            }
//            System.out.println();
//        }


        // 9--> 0-1 Triangle
        int n = 5;

        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                int sum = i+j;
                if (sum % 2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
       // Homework Problem 1: Solid Rhombus

//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            } for (int j=1; j<=n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // Homework Problem 2: Number Pyramid

//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            } for (int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        // Homework Problem 3: Palindromic pattern

//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            } for (int j=i; j>=1; j--){
//                System.out.print(j);
//            } for (int j=2; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
            // Advanced #1 Butterfly pattern
//
//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            } for (int j=1; j<=2*(n-i); j++){
//                System.out.print(" ");
//            } for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i=n; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            } for (int j=1; j<=2*(n-i); j++){
//                System.out.print(" ");
//            } for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //  Hollow Butterfly Pattern

//        int n = 5;
//        int m = 10;
//
//        for (int i=1; i<=n; i++) {
//            for (int j = 1; j <= m; j++) {
//            if (j == 1 || j == 10 || j == i || i + j == 11) {
//                System.out.print("*");
//            } else {
//                    System.out.print(" ");
//                }
//        }
//            System.out.println();
//}  for (int i=n; i>=1; i--) {
//            for (int j = 1; j <= m; j++) {
//                if (j == 1 || j == 10 || j == i || i + j == 11) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//    }
        // Hollow Rhombus

//       int n = 5;
//
//        for (int i=1; i<=n; i++){
//             for(int j=1; j<=5-i; j++){
//                 System.out.print(" ");
//            }
//                for (int j=1; j<=5; j++){
//                    if (i==1 || i==5 || j==1 || j==5){
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }

        // Pascal's Triangle

//        int n = 5;
//        int num = 1;
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=5-i; j++){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print(num+" ");
//                num =
//            }
//            System.out.println();
//        }
      // Half Pyramid
//        int n=5;
//        int num = 1;
//
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Inverted Half Pyramid

//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            for (int j=i; j<=n; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
        }
    }
