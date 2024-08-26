package Basicj;

public class ConstructorEX {

    int id;
    String name;
    int age;

    ConstructorEX(int i , String n,int a) {

        id = i;
        name = n;
        age = a;

        System.out.println(id + " " + name + " "+ age);
    }
    public static void main(String []args) {

            ConstructorEX S1 = new ConstructorEX(111,"Dheeraj",77);
            ConstructorEX S2 = new ConstructorEX(123,"Shubham", 90);
            ConstructorEX S3 = new ConstructorEX(411,"Hii" , 900);

    }
}
