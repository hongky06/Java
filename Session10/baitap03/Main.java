package Session10.baitap03;

public class Main {
    public static void main(String[] args) {

        Duck duck = new Duck("Vịt Donald");
        Fish fish = new Fish("Cá Nemo");

        duck.swim();
        duck.fly();

        System.out.println();
        fish.swim();

        // fish.fly(); //Lỗi compile-time
    }
}
