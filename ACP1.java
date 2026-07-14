class Student {
    String name;
    int rollNo;
    double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Marks : " + marks);
        System.out.println("------------------------");
    }
}

public class ACP1 {
    public static void main(String[] args) {

        Student student1 = new Student("Sam",1,495);
        Student student2 = new Student("Tom",2,492);
        Student student3 = new Student("John",3,489);
        Student student4 = new Student("David",4,487);
        Student student5 = new Student("Rahul",5,485);
        Student student6 = new Student("Amit",6,483);
        Student student7 = new Student("Priya",7,482);
        Student student8 = new Student("Neha",8,480);
        Student student9 = new Student("Riya",9,478);
        Student student10 = new Student("Arjun",10,476);

        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
        student4.displayDetails();
        student5.displayDetails();
        student6.displayDetails();
        student7.displayDetails();
        student8.displayDetails();
        student9.displayDetails();
        student10.displayDetails();
    }
}
