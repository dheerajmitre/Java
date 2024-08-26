package Basicj.Exception.Estring;

import java.util.Arrays;

public class XString {

    public static class StringEx {


        public static void main(String[] args) {

            String str = "Dheeraj";
            String str1 = "Dheeraj";

            String ch[] = { "D,h,e,e,r,a,j" };

            String s2 = new String (Arrays.toString(ch));

            System.out.println(str);
            System.out.println(str1);
            System.out.println(s2);

        }
    }
}
