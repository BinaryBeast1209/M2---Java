
class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Lion extends Animal {

    void roar() {
        System.out.println("Lion is roaring.");
    }
}


class Cub extends Lion {

    void play() {
        System.out.println("Lion cub is playing.");
    }
}



public class Main {

    public static void main(String[] args) {

        Cub cub = new Cub();

        cub.play();   
        cub.roar();   
        cub.eat();    
    }
}
