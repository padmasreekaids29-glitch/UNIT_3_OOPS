class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Vehicle starting...");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    private String fuelType;
    private int doors;

    public Car(String brand, int speed, String fuelType, int doors) {
        super(brand, speed);
        this.fuelType = fuelType;
        this.doors = doors;
    }

    @Override
    public void start() {
        System.out.println("Car starts with key ignition.");
    }

    public void playMusic() {
        System.out.println("Playing music...");
    }
}

class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    public void start() {
        System.out.println("Bike starts with kick.");
    }

    public void doWheelie() {
        System.out.println("Doing wheelie!");
    }
}

class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota", 120, "Petrol", 4);
        Vehicle v2 = new Bike("Yamaha", 100, true);

        v1.start();   // Polymorphism
        v2.start();

        ((Car) v1).playMusic();
        ((Bike) v2).doWheelie();
    }
}


