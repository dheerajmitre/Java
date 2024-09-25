package Basicj.Practice;

class Test1{

    public static void main(String[] args) {
        Phonemodel V = new vivo();
        V.Switchoff();
    }
}
abstract class Phonemodel {

    abstract void Switchoff();
}
class vivo extends Phonemodel{

    @Override
    void Switchoff() {
        System.out.println("NEw Brand");
    }
}
