package apnaCollege;

public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch='a'; ch<='z'; ch++){
            sb.append(ch);
            // TC of SB = O(26)
            // TC of String = O(26 * n^2) = O(n^2)
        }
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(4));
    }
}
