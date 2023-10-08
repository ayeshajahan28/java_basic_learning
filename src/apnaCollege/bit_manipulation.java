package apnaCollege;

public class bit_manipulation {

    public static void oddOrEven(int n){
        int bitMask =1;
        if ((n & bitMask) == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }


    //Get ith Bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if ((n & bitMask)==0){
            return 0;
        } else {
            return 1;
        }
    }
    //Set ith Bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    //Clear ith Bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    //Update ith Bit - 2 ways
    public static int updateIthBit(int n, int i, int newBit){
        // Method (a)
//        if (newBit == 0){
//            return clearIthBit(n, i);
//        } else {
//            return setIthBit(n, i);
//        }

        // Method (b)
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    // Clear last i bits
    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;

    }
    //Clear range of bits from i to j
    public static int clearRangeBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    //Check if a number is a power of 2
    public static boolean isPowerOfTwo(int n){
       return (n & (n-1)) == 0;
    }

    //Count set bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while (n > 0){
            if ((n & 1) == 1){   // check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    //Fast Exponentiation
    public static int fastExpo(int a, int n){
        int ans = 1;
        while (n > 0){
            if ((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static long fastExpoModulo(long a, long n, long x){
        long ans = 1;
        while (n > 0){
            if ((n & 1) != 0){
//          ans = (ans % x * a % x) % x; // ans will never cross x bcoz final result is mod x, ex: 3%5=3
                ans = (ans * a % x) % x;
            }
            a = (a % x * a % x) % x;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(5 & 6);   //4
//        System.out.println(5 | 6);   //7
//        System.out.println(5 ^ 6);   //3
//        System.out.println(~ 5);     //-6
//        System.out.println(5<<2);    //20
//        System.out.println(6>>1);    //3


//        oddOrEven(10);
//        oddOrEven(13);
//        oddOrEven(92);

//        System.out.println(getIthBit(10, 3));
//        System.out.println(setIthBit(10, 2));
//        System.out.println(clearIthBit(10, 1));
//        System.out.println(updateIthBit(10, 2, 1));
//        System.out.println(clearIBits(15, 2));
//        System.out.println(clearRangeBits(10, 2, 4));
//        System.out.println(isPowerOfTwo(18));
//        System.out.println(countSetBits(15));
        System.out.println(fastExpo(3, 5));
        System.out.println(fastExpoModulo(25, 5, 4));
    }
}
