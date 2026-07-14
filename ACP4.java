class Shape {

    private double value1;
    private double value2;
    private double value3;

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setValue3(double value3) {
        this.value3 = value3;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double getValue3() {
        return value3;
    }
}

class Cube extends Shape {

    void getVolume() {
        double volume = getValue1() * getValue1() * getValue1();
        System.out.println("Volume of Cube = " + volume);
    }
}

class Cuboid extends Shape {

    void getVolume() {
        double volume = getValue1() * getValue2() * getValue3();
        System.out.println("Volume of Cuboid = " + volume);
    }
}

class Cylinder extends Shape {

    void getVolume() {
        double volume = 3.14 * getValue1() * getValue1() * getValue2();
        System.out.println("Volume of Cylinder = " + volume);
    }
}

public class ACP4 {

    public static void main(String args[]) {

        Cube c = new Cube();
        c.setValue1(5);
        c.getVolume();

        Cuboid cb = new Cuboid();
        cb.setValue1(5);
        cb.setValue2(6);
        cb.setValue3(7);
        cb.getVolume();

        Cylinder cy = new Cylinder();
        cy.setValue1(4);
        cy.setValue2(8);
        cy.getVolume();
    }
}
