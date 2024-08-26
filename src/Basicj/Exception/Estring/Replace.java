package Basicj.Exception.Estring;

public class Replace {

    public static void main (String[]args){

        String str1 = "My Name is Dheeraj Mitre ggggggg";

        str1 = str1.replaceAll("\\s+","");

        System.out.println("String After:" + str1);
    }
}
