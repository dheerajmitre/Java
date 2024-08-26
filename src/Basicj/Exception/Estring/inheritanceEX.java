package Basicj.Exception.Estring;


public class inheritanceEX {

    int test() {

        System.out.println("1");
        return 0;
    }
}
    class B extends inheritanceEX {

        int student () {
            System.out.println("2");
            return 0;
        }

        public static void main(String[] args) {
            inheritanceEX x = new inheritanceEX();
            B b = new B();
            b.student();
            x.test();

        }
        }




