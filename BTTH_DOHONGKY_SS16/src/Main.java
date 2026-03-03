import java.util.*;

public class Main {

    public static void main(String[] args) {

        ProductRepository repository = new ProductRepository();

        repository.add(new ElectronicProduct("E01", "Laptop Dell", 20000000, 24));
        repository.add(new ElectronicProduct("E02", "Chuột Logitech", 500000, 6));
        repository.add(new FoodProduct("F01", "Bánh Oreo", 50000, 10));
        repository.add(new FoodProduct("F02", "Sữa Vinamilk", 30000, 5));


        System.out.println("DANH SÁCH SẢN PHẨM ");

        List<Product> list = repository.findAll();

        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);

            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
        }

        
        System.out.println("\n TÌM SẢN PHẨM ");

        String searchId = "E01";
        Product found = repository.findById(searchId);

        if (found != null) {
            found.displayInfo();
            System.out.println("Thành tiền: " + found.calculateFinalPrice());
        } else {
            System.out.println("Không tìm thấy!");
        }

        
        System.out.println("\n SẮP XẾP TĂNG DẦN ");

        Collections.sort(list, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                if (p1.calculateFinalPrice() > p2.calculateFinalPrice()) {
                    return 1;
                } else if (p1.calculateFinalPrice() < p2.calculateFinalPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < list.size(); i++) {
            Product p = list.get(i);
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
           
        }


        System.out.println("\n THỐNG KÊ ");

        Map<String, Integer> map = new HashMap<String, Integer>();

        int electronicCount = 0;
        int foodCount = 0;

        for (int i = 0; i < list.size(); i++) {

            Product p = list.get(i);

            if (p instanceof ElectronicProduct) {
                electronicCount++;
            }

            if (p instanceof FoodProduct) {
                foodCount++;
            }
        }

        map.put("Electronic", electronicCount);
        map.put("Food", foodCount);

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}