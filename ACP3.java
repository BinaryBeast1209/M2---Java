// Parent class
class Animal {

    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Method Overloading
    void sound(String name) {
        System.out.println(name + " barks loudly");
    }

    void sound(int times) {
        System.out.println("Dog barked " + times + " times");
    }
}

public class ACP3 {

    public static void main(String args[]) {

        Dog obj = new Dog();

        // Overridden method
        obj.sound();

        // Overloaded methods
        obj.sound("Tommy");
        obj.sound(5);
    }
}
