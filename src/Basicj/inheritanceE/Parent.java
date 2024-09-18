package Basicj.inheritanceE;

public class Parent {
    String name;

    void method() {
        System.out.println("method from parent");
    }
}

class child extends Parent {
    int id;

    @Override
    void method() {
        System.out.println("method from child");
    }

    public class GFG {

        public static void main(String[] args) {


            Parent p = new child();
            p.name = "Dheeraj";
            System.out.println(p.name);
            p.method();
            child c = (child)p;
            c.id = 1;
            System.out.println(c.name);
            System.out.println(c.id);

            c.method();
        }
    }
}
