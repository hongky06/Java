import java.util.*;

public class Main {
    public static void main(String[] args) {


        List<String> danhSachCaBenh = Arrays.asList(
                "Cúm A",
                "Sốt xuất huyết",
                "Cúm A",
                "Covid-19",
                "Cúm A",
                "Sốt xuất huyết"
        );


        Map<String, Integer> thongKe = new TreeMap<>();

        for (String benh : danhSachCaBenh) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        System.out.println("BÁO CÁO CA BỆNH TRONG NGÀY:");
        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}