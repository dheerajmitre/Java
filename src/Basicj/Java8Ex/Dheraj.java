package Basicj.Java8Ex;

public class Dheraj extends Student {

    String name;
    Dheraj(String P, String Pu, String name) {
        super(P, Pu);
        this.name = name ;
    }

    @Override
    void show(){
        super.display();
        System.out.println( name) ;
    }

    public static void main(String[] args) {

        Student  d = new Student("A","B");
        d.show();
        d.display();

        System.out.println(d);
    }
}
