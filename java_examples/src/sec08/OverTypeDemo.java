package sec08;

class Vehicle {
    String name = "vehicle";

    void whoami() {
        System.out.println("I am a vehicle");
    }
    static void move() {
        System.out.println("moving");
    }
}

class Car extends Vehicle {
    String name = "car";

    void whoami() {
        System.out.println("i am a car");
    }
    static void move() {
        System.out.println("driving");
    }
}

public class OverTypeDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
    }
}
