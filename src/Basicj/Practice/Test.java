package Basicj.Practice;

public class Test {

//    Abstract class has anstract method and non abstract method
//
//    abstract class have method  only write in parent
//
//            abtract class has without method body

    public static void main(String[] args) {
        Parent1 c = new child2();


        c.great();
        c.greek();
        c.display();
    }
}
abstract class Parent1 {

    abstract void great();
    abstract void display();

    void greek() {
        System.out.println("Sleep");
    }

    public Parent1() {
        System.out.println(" I am Constructor");
    }
}
class child2 extends Parent1 {
    @Override
    public void display() {
        System.out.println("Displayy");
    }

    @Override
    void great() {

        System.out.println("ossss");

    }
}

