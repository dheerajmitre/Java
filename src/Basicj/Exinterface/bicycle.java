package Basicj.Exinterface;

class Bicycle {

    int gear;
    int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public boolean brake(int decrement) {
        speed -= decrement;
        return false;
    }

    public String speedup(int increment) {
        speed += increment;
        return "Number of gears: " + gear + "\n" + "Speed of bicycle: " + speed;
    }
}

class Honda extends Bicycle {

    int price;

    public Honda(int gear, int speed, int price) {
        super(gear, speed);
        this.price = price;
    }

    @Override
    public String speedup(int increment) {

        super.speedup(increment); // Call the superclass method to update speed
        return "Honda bicycle with " + gear + " gears, speed: " + speed + ", price: " + price;
    }
}

class Xyz{

    public static void main(String[] args) {
        Honda mb = new Honda(3, 100, 25);
        System.out.println(mb.speedup(10));
        System.out.println(mb.brake(7));// Increment speed and print details
    }
}
