package Basicj.Practice;


public interface Animal {

    boolean sleep = true;

    void sound();

    default void eat(){

        System.out.println("animal eating ");
    }

    static  void sleep(){
        System.out.println("rrr");
    }
}

class main implements Animal{

    @Override
    public void sound() {
    }
    @Override
    public void eat() {
        Animal.super.eat();
    }
}
class Main1 {
    public static void main(String[] args) {
        Animal glassy = new main();
        glassy.eat();
        glassy.sound();
        Animal.sleep();
        }
    }
