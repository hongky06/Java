import java.util.Scanner;

public class  Main {

    // PHẦN 1: Chuẩn hóa họ tên
    static String chuanHoaTen(String s) {
        if (s == null || s.trim().length() == 0) {
            return "Lỗi: không nhập nội dung";
        }

        String ketQua = "";

        // Giữ lại chữ cái và khoảng trắng
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ') {
                ketQua += c;
            }
        }

        ketQua = ketQua.trim();
        while (ketQua.contains("  ")) {
            ketQua = ketQua.replace("  ", " ");
        }

        String[] arr = ketQua.split(" ");
        ketQua = "";

        for (int i = 0; i < arr.length; i++) {
            String tu = arr[i];
            ketQua += tu.substring(0, 1).toUpperCase()
                    + tu.substring(1).toLowerCase() + " ";
        }

        return ketQua.trim();
    }

    // PHẦN 2: Ký tự không lặp lại đầu tiên
    static String kyTuKhongLap(String s) {
        if (s == null || s.length() == 0) {
            return "Lỗi: không nhập nội dung";
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int dem = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    dem++;
                }
            }

            if (dem == 1) {
                return String.valueOf(c);
            }
        }

        return "Không tìm thấy";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String ten = sc.nextLine();
        System.out.println(chuanHoaTen(ten));

        System.out.print("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        System.out.println(kyTuKhongLap(chuoi));
    }
}