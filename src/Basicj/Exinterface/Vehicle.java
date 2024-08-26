package Basicj.Exinterface;
// Corrected the spelling of 'vechile' to 'Vehicle'
public interface Vehicle {
    void BMW(int price);

    void KIA(int price);

    void BREZZA(int price);
}

// Class name should start with a capital letter
class Cars implements Vehicle {

    @Override
    public void BMW(int price) {
        System.out.println(price);
    }

    @Override
    public void KIA(int price) {
        System.out.println(price);
    }

    @Override
    public void BREZZA(int price) {
        System.out.println(price);
    }

    // Moved Test class outside of Cars class and made it public
    public static void main(String[] args) {
        Cars car = new Cars();
        car.BMW(123);
        car.KIA(900);
        car.BREZZA(899);
    }
}
