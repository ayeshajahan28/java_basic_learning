package apnaCollege;

public class add1ToInteger {

    public static void main(String[] args) {
        //Method a - using NOT Operator: -x = ~x + 1; -~x = x + 1
        int x = -4;
        System.out.println(x + " + 1 is " + -~x);

        //Method b - Using & and XOR operator
        int m = 1;
        while ((x & m) >= 1){
            x = x ^ m;
            m = m << 1;
        }
        x = x ^ m;
        System.out.println(x);

        //Convert uppercase characters to lowercase characters
        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}
