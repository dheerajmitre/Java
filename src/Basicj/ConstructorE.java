package Basicj;

public class ConstructorE {

    int id;
    String name;

    ConstructorE(int i, String n) {
        id = i;
        name = n;
    }

    void Display() {
        System.out.println(id + "" + name);
    }

    public static void main(String []args) {

        ConstructorE Data = new ConstructorE(111 ,"Dheeraj");
        ConstructorE Data1 = new ConstructorE(555 ,"trtte");

        Data.Display();
        Data1.Display();

    }
}