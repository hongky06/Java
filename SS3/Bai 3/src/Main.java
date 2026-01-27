public class Main {

    public static void maxQuantityOfBooks(String[] names, int[] quantities) {

        int max = quantities[0];

        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                hienthi(names[i], quantities[i]);
            }
        }
    }

    public static void hienthi(String name, int soluong) {
        System.out.println(name + " - " + soluong);
    }

    public static void main(String[] args) {

        String[] sach = {"Do Hong Ky", "abc"};
        int[] soluong = {10, 2};
        maxQuantityOfBooks(sach, soluong);
    }
}