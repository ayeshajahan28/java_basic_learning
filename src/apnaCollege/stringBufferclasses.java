package apnaCollege;

import org.w3c.dom.ls.LSOutput;

public class stringBufferclasses {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  // sb object by default can store 16 characters // 16 + string length

        sb.append("hello");
        System.out.println(sb.capacity());

        sb.append("ayesha jahan");
        System.out.println(sb.capacity());  // (old capacity+1)*2 or (old capacity*2)+2

    }


}
