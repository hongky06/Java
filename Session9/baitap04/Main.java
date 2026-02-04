package Session9.baitap04;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting (tự động, an toàn)
        animal.sound(); // gọi Dog.sound() (runtime)
        // animal.wagTail(); LỖI BIÊN DỊCH
        // Vì Animal KHÔNG biết wagTail()
        // Downcasting an toàn
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Ép kiểu xuống
            dog.wagTail();          // OK
        }
    }
}
