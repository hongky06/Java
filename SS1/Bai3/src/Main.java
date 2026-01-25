public class Main {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";

        String Temp;

        Temp = book1;
        book1 = book2;
        book2 = Temp;


        System.out.println("\nSau khi hoán đổi:");
        System.out.println("Book1 = " + book1);
        System.out.println("Book2 = " + book2);
    }
}