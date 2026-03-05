import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi danh muc: ");
        String input = sc.nextLine();


        String[] arr = input.split(",");

        for (String s : arr) {

            String category = s.trim().toLowerCase();

            if (map.containsKey(category)) {
                map.put(category, map.get(category) + 1);
            } else {
                map.put(category, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
        }
        System.out.println();

        String most = "";
        String least = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                most = entry.getKey();
            }

            if (entry.getValue() < min) {
                min = entry.getValue();
                least = entry.getKey();
            }
        }

        System.out.println("Most: " + most + ", Least: " + least);

        System.out.print("Nhap danh muc can tim: ");
        String search = sc.nextLine().trim().toLowerCase();

        int result = map.getOrDefault(search, 0);

        System.out.println("Search \"" + search + "\": " + result);
    }
}