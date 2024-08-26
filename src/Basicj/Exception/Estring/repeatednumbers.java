package Basicj.Exception.Estring;

public class repeatednumbers {

    public static void main(String[] args) {

        String Dheeraj = "dheeraj";

        int[] charcount = new int[256]; // Assuming aschii Charecters

for (int i =0; i<Dheeraj.length();i++) {
    char c =Dheeraj.charAt(i);
    charcount[c]++;
}

for (int i = 0; i < charcount.length;i++){

    if(charcount[i]> 0 ) {
        System.out.println((char) i + " " + charcount[i]);
    }
}
    }
}