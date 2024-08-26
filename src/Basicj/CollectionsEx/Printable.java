package Basicj.CollectionsEx;

public interface Printable {
    void print();
}
interface Showable{
    void show ();
}
class Test implements Printable,Showable {


    public static void main(String[] args) {

        Test obj = new Test();
        obj.print();
        obj.show();
    }

    @Override
    public void print() {
        System.out.println("print the page");
    }

    @Override
    public void show() {
        System.out.println("show the page");
    }
}
