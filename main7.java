class Vehicle {

    int speed = 80;
}

class Car extends Vehicle {

    int speed = 120;

    void displaySpeed() {
        System.out.println(speed);
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        car.displaySpeed();
    }
}
