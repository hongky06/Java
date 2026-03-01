import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Set<String> thanhPhanThuoc = new HashSet<>();

        System.out.print("Nhập số lượng thành phần thuốc: ");
        int soLuongThuoc = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập các thành phần thuốc:");
        for (int i = 0; i < soLuongThuoc; i++) {
            thanhPhanThuoc.add(sc.nextLine());
        }


        Set<String> chatDiUng = new HashSet<>();

        System.out.print("Nhập số lượng chất dị ứng: ");
        int soLuongDiUng = Integer.parseInt(sc.nextLine());

        System.out.println("Nhập các chất dị ứng:");
        for (int i = 0; i < soLuongDiUng; i++) {
            chatDiUng.add(sc.nextLine());
        }


        Set<String> giao = new HashSet<>(thanhPhanThuoc);
        giao.retainAll(chatDiUng);

        if (giao.isEmpty()) {
            System.out.println("Thuốc AN TOÀN – Không có chất gây dị ứng.");
        } else {
            System.out.println("Thuốc KHÔNG an toàn. Chất gây dị ứng:");
            for (String s : giao) {
                System.out.println("- " + s);
            }
        }
        Set<String> hieu = new HashSet<>(thanhPhanThuoc);
        hieu.removeAll(chatDiUng);

        System.out.println("Thành phần thuốc bệnh nhân KHÔNG dị ứng:");
        for (String s : hieu) {
            System.out.println("- " + s);
        }
    }
}