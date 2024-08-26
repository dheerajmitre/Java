package Basicj.Exception;

public class Scharat {

    public static void main(String[] args) {

        String str = "My Name Is Dheeraj Mitre";
        for (int i = 0; i<=str.length()-1;i++){
            if(i%2!=0) {
                System.out.println("char at" + i + "place" + str.charAt(i));
            }
        }
    }
}
