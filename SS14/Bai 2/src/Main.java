import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> danhMucThuoc = new HashMap<>();


        danhMucThuoc.put("T01", "Paracetamol");
        danhMucThuoc.put("T02", "Ibuprofen");
        danhMucThuoc.put("T03", "Amoxicillin");
        danhMucThuoc.put("T04", "Vitamin C");
        danhMucThuoc.put("T05", "Aspirin");


        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã thuốc: ");
        String maThuoc = sc.nextLine();

        if (danhMucThuoc.containsKey(maThuoc)) {
            System.out.println("Tên thuốc: " + danhMucThuoc.get(maThuoc));
        } else {
            System.out.println("Thuốc không tồn tại");
        }
    }
}