package Basicj.Exinterface;

public class test {
    void run() {

        System.out.println("Dheeraj");
    }
}

class Hall extends test {

    void  speed() {

        System.out.println("ghhgh");
    }

    public static void main(String[] args) {
        Hall x = new Hall ();
        x.speed();
        x.run();
    }
}