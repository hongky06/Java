import java.util.Scanner;

public class Main {

    // PHẦN 1: Chuẩn hóa họ tên
    static String chuanHoaHoTen(String chuoiNhap) {
        String chuoiTam = "";
        for (int i = 0; i < chuoiNhap.length(); i++) {
            char kyTu = chuoiNhap.charAt(i);

            if ((kyTu >= 'a' && kyTu <= 'z')
                    || (kyTu >= 'A' && kyTu <= 'Z')
                    || kyTu == ' ') {

                chuoiTam = chuoiTam + kyTu;
            }
        }

        chuoiTam = chuoiTam.trim();
        while (chuoiTam.contains("  ")) {
            chuoiTam = chuoiTam.replace("  ", " ");
        }

        String ketQua = "";
        boolean laKyTuDauTu = true;

        for (int i = 0; i < chuoiTam.length(); i++) {
            char kyTu = chuoiTam.charAt(i);

            if (kyTu == ' ') {
                ketQua = ketQua + kyTu;
                laKyTuDauTu = true;
            } else {
                if (laKyTuDauTu == true) {
                    ketQua = ketQua + Character.toUpperCase(kyTu);
                    laKyTuDauTu = false;
                } else {
                    ketQua = ketQua + Character.toLowerCase(kyTu);
                }
            }
        }

        return ketQua;
    }

    // PHẦN 2: Tìm ký tự không lặp lại đầu tiên
    static String timKyTuKhongLap(String chuoiNhap) {

        for (int i = 0; i < chuoiNhap.length(); i++) {
            char kyTu = chuoiNhap.charAt(i);
            int soLanXuatHien = 0;

            for (int i = 0; i < chuoiNhap.length(); i++) {
                if (chuoiNhap.charAt(i) == kyTu) {
                    soLanXuatHien = soLanXuatHien + 1;
                }
            }

            if (soLanXuatHien == 1) {
                return String.valueOf(kyTu);
            }
        }

        return "Không tìm thấy";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        String hoTen = scanner.nextLine();
        System.out.println("Kết quả: " + chuanHoaHoTen(hoTen));

        System.out.print("Nhập chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();
        System.out.println("Kết quả: " + timKyTuKhongLap(chuoi));
    }
}