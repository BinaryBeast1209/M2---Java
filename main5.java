class Mammals {

    void displayMammal() {
        System.out.println("Inside Mammals Class");
    }
}

class Lion extends Mammals {

    void roar() {
        System.out.println("Inside Lion Class");
    }
}

class Human extends Mammals {

    void speak() {
        System.out.println("Inside Human Class");
    }
}

public class Main {

    public static void main(String[] args) {

        Lion lion = new Lion();

        lion.roar();
        lion.displayMammal();
    }
}
