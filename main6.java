class Animal {

    public void makeSound() {
        System.out.println("Sound from Animal");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark from Dog");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal obj = new Dog();

        obj.makeSound();
    }
}
