class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = a;

        b = 20;

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20



        Student s1 = new Student("An");
        Student s2 = s1;

        s2.name = "Bình";

        System.out.println("s1.name = " + s1.name); // Bình
        System.out.println("s2.name = " + s2.name); // Bình
    }
}
