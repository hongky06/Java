package Session10.baitap06;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Chuột", 150));
        list.add(new Product("Bàn phím", 300));
        list.add(new Product("Màn hình", 2500));
        list.add(new Product("Tai nghe", 500));
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });
        System.out.println("=== Sắp xếp theo GIÁ tăng dần (Anonymous Class) ===");
        for (Product p : list) {
            p.display();
        }
        Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));

        System.out.println("\n=== Sắp xếp theo TÊN A-Z (Lambda) ===");
        for (Product p : list) {
            p.display();
        }

    }
}
