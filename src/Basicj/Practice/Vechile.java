package Basicj.Practice;

public interface Vechile {

    void gettype();

    default void displayinfo(){
        System.out.println("this");
    }
    static void canDsoutrive(){

        System.out.println("all vechiles are Drive");
    }
}

class Car implements Vechile{

    @Override
    public void gettype() {
        System.out.println("rrrr");
    }

    @Override
    public void displayinfo() {

    }
}
class Motorcycle implements Vechile{

    @Override
    public void gettype() {
        System.out.println("eee");
    }

    @Override
    public void displayinfo() {
        System.out.println("Display The Informtion Car");
    }
}

