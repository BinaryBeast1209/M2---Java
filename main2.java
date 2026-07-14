
class Person {

    int id;
    int age;
    String name;

    void displayName(String studentName) {
        System.out.println("Student Name : " + studentName);
    }
}

class Student extends Person {

    void displayAge(int studentAge) {
        System.out.println("Student Age  : " + studentAge);
    }
}


public class Main {

    public static void main(String[] args) {

        Student student = new Student();

        student.displayName("Aashish");
        student.displayAge(14);
    }
}
