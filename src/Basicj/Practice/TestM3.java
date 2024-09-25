package Basicj.Practice;

public class TestM3{

    public static void main(String[] args) {
        Vechile car = new Car();
        Vechile motorcycle =new Motorcycle();

        car.gettype();
        car.displayinfo();
        Vechile.canDsoutrive(); // static calling method
        motorcycle.gettype();
        motorcycle.gettype();
        

    }
}
